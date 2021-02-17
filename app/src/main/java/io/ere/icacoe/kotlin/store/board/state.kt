package io.ere.icacoe.kotlin.store.board

import org.rekotlin.StateType

data class BoardState(
  var full: Boolean = false,
  var positions: List<String> = listOf(" ", " ", " ", " ", " ", " ", " ", " ", " ")
): StateType