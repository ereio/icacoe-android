package io.ere.icacoe.kotlin.store.game

import org.rekotlin.StateType

data class GameState(
  var wins: List<String> = listOf(),
  var currentPlayer: String = "X",
  var winner: String? = null
): StateType