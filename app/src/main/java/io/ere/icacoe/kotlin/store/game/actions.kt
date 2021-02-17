package io.ere.icacoe.kotlin.store.game

import org.rekotlin.Action

class ToggleCurrentPlayer() : Action
data class SetCurrentPlayer(val currentPlayer: String) : Action
data class SetWinner(val winningPlayer: String) : Action

class ResetGame : Action
