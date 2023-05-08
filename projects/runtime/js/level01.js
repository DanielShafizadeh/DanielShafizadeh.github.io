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
                { "type": "sawblade", "x": 400, "y": groundY },
                { "type": "sawblade", "x": 600, "y": groundY },
                { "type": "sawblade", "x": 900, "y": groundY },
                { "type": "reward", "x": 200, "y": groundY-30},
                {"type":"obstacle","x":800,"y":groundY-50},
                {"type":"enemy","x":300,"y":groundY},
                {"type":"projecti","x":100,"y":groundY-200}


            ]
        };
        for(var i=0;i<gameItems.length;i++){
            var ite=gameItems[i];
            if(ite.type==="sawblade"){
                ite.createSawBlade(ite.x,ite.y);
            }
            else if(ite.type==="reward"){
                ite.createReward(ite.x,ite.y);
            }
            else if(ite.type==="enemy"){
                ite.createEnemy(ite.x,ite.y);
            }
            else if(ite.type==="obstacle"){
                ite.createObstacle(ite.x,ite.y);
            }
            else{
                ite.createProjecti(ite.x,ite.y);
            }
        }
        window.levelData = levelData;
        // set this to true or false depending on if you want to see hitzones
        game.setDebugMode(false);

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
            obstacleImage.x=-x;
            obstacleImage.y=-y;
        }
        function createProjecti(x,y){
            var hitZoneSize=10;
            var damageFromObstacle=20;
            var sawBladeHitZone=game.createObstacle(hitZoneSize,damageFromObstacle);
            sawBladeHitZone.x=x;
            sawBladeHitZone.y=y;
            game.addGameItem(sawBladeHitZone);
            var obstacleImage=draw.bitmap("img/square.png");
            sawBladeHitZone.addChild(obstacleImage);
            obstacleImage.x=-x;
            obstacleImage.y=-y;
        }
       
        var enemy=game.createGameItem("enemy",25);
        var redSquare=draw.rect(50,50,"red");
        redSquare.x=-25;
        redSquare.y=-25;
        enemy.addChild(redSquare);
        enemy.x=400;
        enemy.y=groundY-50;
        game.addGameItem(enemy);
        
        function createEnemy(x,y){
            enemy.velocityX=10;
            enemy.rotationalVelocity=25;
            enemy.onPlayerCollision = function () {game.changeIntegrity(-30);};
            enemy.onProjectileCollision = function () {game.increaseScore(100);
            enemy.shrink();};
        };
        var reward=game.createGameItem("reward",25);
        var blueCirc=draw.circ(25,"blue");
        redSquare.x=-10;
        redSquare.y=-10;
        reward.addChild(blueCirc);
        reward.x=400;
        reward.y=groundY-50;
        game.addGameItem(reward);
        
        function createReward(x,y){
            enemy.velocityX=10;
            enemy.rotationalVelocity=25;
            enemy.onPlayerCollision = function () {game.changeIntegrity(+30);game.increaseScore(300);};
            enemy.onProjectileCollision = function () {
            enemy.shrink();};
        };
        createEnemy(400,groundY-10);
        createEnemy(800,groundY-100);
        createEnemy(1200,groundY-50);
        
        
        // DO NOT EDIT CODE BELOW HERE
    }
};

// DON'T REMOVE THIS CODE //////////////////////////////////////////////////////
if((typeof process !== 'undefined') &&
    (typeof process.versions.node !== 'undefined')) {
    // here, export any references you need for tests //
    module.exports = level01;
}
