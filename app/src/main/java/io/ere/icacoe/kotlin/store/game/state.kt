package io.ere.icacoe.kotlin.store.game

import org.rekotlin.StateType

data class GameState(
  var wins: List<String> = listOf(),
  var winner: String? = null,
  var currentPlayer: String = "X"
): StateType