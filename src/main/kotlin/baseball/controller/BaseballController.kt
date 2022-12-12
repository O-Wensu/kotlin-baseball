package baseball.controller

import baseball.domain.BaseballGame
import baseball.domain.BaseballData
import baseball.view.InputView
import baseball.view.OutputView

class BaseballController {
    private val outputView = OutputView()
    private val inputView = InputView()

    fun gameStart() {
        outputView.printGameStart()
        generateComputerNumber()
        outputView.printInputNumber()
        BaseballData.userNumber = inputView.inputNumber()
        getCompareResult()
    }

    private fun generateComputerNumber() {
        val baseball = BaseballGame()
        val computerNumber = baseball.generateNumber()
        BaseballData.computerNumber = computerNumber
        println(computerNumber) // 제거
    }

    private fun getCompareResult() {
        val baseballGame = BaseballGame()
        val (ball, strike) = baseballGame.compareNumber(BaseballData.userNumber, BaseballData.computerNumber)
    }

}