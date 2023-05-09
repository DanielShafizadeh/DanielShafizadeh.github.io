var level01 = function (window) {

    window.opspark = window.opspark || {};

    var draw = window.opspark.draw;
    var createjs = window.createjs;

    window.opspark.runLevelInGame = function(game) {
        // some useful constants 
        var groundY = game.groundY;

        // this data will allow us to define all of the
        // behavior of our game
        var levelData = {
            "name": "Robot Romp",
            "number": 1, 
            "speed": -3,
            "gameItems": [
                { "type": "sawblade", "x": 400, "y": groundY-21 },
                { "type": "sawblade", "x": 600, "y": groundY },
                { "type": "sawblade", "x": 900, "y": groundY },
                { "type": "reward", "x": 200, "y": groundY-30},
              
                {"type":"enemy","x":200,"y":groundY},



            ]
        };
        for(var i=0;i<levelData.gameItems.length;i++){
            var ite=levelData.gameItems[i];
            if(ite.type==="sawblade"){
                createSawBlade(ite.x,ite.y);
            }
            else if(ite.type==="reward"){
                createReward(ite.x,ite.y);
            }
            else if(ite.type==="enemy"){
                createEnemy(ite.x,ite.y);
            }
        
            
        }
        window.levelData = levelData;
        // set this to true or false depending on if you want to see hitzones
        game.setDebugMode(true);

        // TODO 6 and on go here
        // BEGIN EDITING YOUR CODE HERE
        function createSawBlade(x,y){
            var hitZoneSize=25;
            var damageFromObstacle=10;
            var sawBladeHitZone=game.createObstacle(hitZoneSize,damageFromObstacle);
            sawBladeHitZone.x=-25;
            sawBladeHitZone.y=-25;
            game.addGameItem(sawBladeHitZone);
            var obstacleImage=draw.bitmap("img/sawblade.png");
            sawBladeHitZone.addChild(obstacleImage);
            obstacleImage.x=x;
            obstacleImage.y=y;
        }
       
       
       
        
        function createEnemy(x,y){
            var enemy=game.createGameItem("enemy",25);
            var redSquare=draw.rect(50,50,"red");
            redSquare.x=-x;
            redSquare.y=-y;
            enemy.addChild(redSquare);
            enemy.x=x;
            enemy.y=y;
            enemy.velocityX=-2;
            
            
            game.addGameItem(enemy);
            enemy.onPlayerCollision = function () {game.changeIntegrity(-30);};
            enemy.onProjectileCollision = function () {game.increaseScore(100);
            enemy.fadeOut();};
            
        };
        
        
        function createReward(x,y){
            var reward=game.createGameItem("reward",25);
            var blueCirc=draw.circle(25,"blue");
            blueCirc.x=-10;
            blueCirc.y=-10;
            reward.addChild(blueCirc);
            reward.x=400;
            reward.y=groundY-50;
            game.addGameItem(reward);
            reward.velocityX=10;
            reward.rotationalVelocity=25;
            reward.onPlayerCollision = function () {game.changeIntegrity(+30);game.increaseScore(300);};
            reward.onProjectileCollision = function () {
            reward.shrink();};
        };
        
        
        
        // DO NOT EDIT CODE BELOW HERE
    }
};

// DON'T REMOVE THIS CODE //////////////////////////////////////////////////////
if((typeof process !== 'undefined') &&
    (typeof process.versions.node !== 'undefined')) {
    // here, export any references you need for tests //
    module.exports = level01;
}
