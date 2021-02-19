package io.ere.icacoe.kotlin.store.game

import org.rekotlin.Action

class ToggleCurrentPlayer() : Action
data class SetCurrentPlayer(val currentPlayer: String) : Action
class CheckWinner : Action
data class SetWinner(val winner: String) : Action

class ResetGame : Action
