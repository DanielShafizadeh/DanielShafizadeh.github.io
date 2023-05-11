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
                { "type": "sawblade", "x": 400, "y": groundY-120 },
                { "type": "sawblade", "x": 700, "y": groundY-75 },
                { "type": "sawblade", "x": 1200, "y": groundY-35 },
                { "type": "reward", "x": 2000, "y": groundY-128},
                { "type": "custom", "x": 1000, "y": groundY-5},
                {"type":"enemy","x":1800,"y":groundY-64},
                {"type":"enemy","x":2200,"y":groundY},



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
            else if(ite.type==="custom"){
                createProjectile(ite.x,ite.y);
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
            sawBladeHitZone.x=x;
            sawBladeHitZone.y=y;
            game.addGameItem(sawBladeHitZone);
            var obstacleImage=draw.bitmap("img/sawblade.png");
            sawBladeHitZone.addChild(obstacleImage);
            obstacleImage.x=-hitZoneSize;
            obstacleImage.y=-hitZoneSize;
        }
        function createProjectile(x,y){
            var hitZoneSize=50;
            var damageFromObstacle=10;
            var myProj = game.createObstacle(hitZoneSize,damageFromObstacle);
            myProj.x=x;
            myProj.y=y;
            game.addGameItem(myProj);
            var obstacleImage=draw.bitmap('img/car.png');
            myProj.addChild(obstacleImage);
            obstacleImage.x=-hitZoneSize;
            obstacleImage.y=-hitZoneSize;

        }
       
       
       
        
        function createEnemy(x,y){
            var enemy=game.createGameItem("enemy",80);
            var redSquare=draw.bitmap('img/gman.png');
            redSquare.x=-80;
            redSquare.y=-80;
            enemy.addChild(redSquare);
            enemy.x=x;
            enemy.y=y;
            
            
            
            game.addGameItem(enemy);
            enemy.velocityX=-2;
            enemy.onPlayerCollision = function () {game.changeIntegrity(-50);};
            enemy.onProjectileCollision = function () {game.increaseScore(200);
            enemy.fadeOut();};
            
        };
        
        
        function createReward(x,y){
            var reward=game.createGameItem("reward",25);
            var blueCirc=draw.circle(25,"blue");
            blueCirc.x=-32;
            blueCirc.y=-32;
            reward.addChild(blueCirc);
            reward.x=x;
            reward.y=y;
            game.addGameItem(reward);
            reward.velocityX=-2;
            reward.rotationalVelocity=4;
            reward.onPlayerCollision = function () {game.changeIntegrity(+25);game.increaseScore(300); reward.fadeOut();};
            reward.onProjectileCollision = function () {
            reward.fadeOut();};
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
