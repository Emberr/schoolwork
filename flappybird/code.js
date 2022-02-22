window.onload = function () {
    let canvas = document.getElementById("game-canvas")
    let graphics = document.getElementById("game-graphics")

    let context = canvas.getContext("2d")

    class Sprite {
        constructor(imageX, imageY, width, height) {
            this.imageX = imageX
            this.imageY = imageY
            this.width = width
            this.height = height
        }
        draw(screenX, screenY) {
            context.drawImage(graphics, this.imageX, this.imageY, this.width, this.height, screenX, screenY, this.width, this.height)
        }
    }

    let background = new Sprite(146, 0, 143, 255)
    let bird = new Sprite(0, 490, 25, 15)
    let pipe1 = new Sprite(0, 323, 27, 161)

    let birdY = 100
    let pipeX = 150
    let pipeY = 250

    function onFrame() {
        background.draw(0, 0)

        pipe1.draw(pipeX, pipeY)

        bird.draw(50, 50)
        pipeX -= 1

        if (pipeX == -25) {
            pipeX = 155
            pipeY = Math.floor((Math.random() * 205) + 75);

        }
        birdY += 1

        canvas.addEventListener("keydown", function () {
            birdY -= 10
        })
    }

    setInterval(onFrame, 20)

}