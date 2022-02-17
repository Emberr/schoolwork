window.onload = function() {
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

    let background = new Sprite(146,0,143,255)
    let bird = new Sprite(0,490,25,15)

    background.draw(0,0)
    bird.draw(50,50)
}