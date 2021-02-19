package io.ere.icacoe.kotlin.store.game

import io.ere.icacoe.kotlin.store.board.BoardState
import org.rekotlin.Action

fun gameReducer(action: Action, state: GameState = GameState()): GameState {
    when (action) {
        is SetCurrentPlayer -> {
            var currentPlayer = action.currentPlayer;
            // no ternary in kotlin
            return state.copy(currentPlayer = if(currentPlayer == "X") "X" else "O")
        }
        is ToggleCurrentPlayer -> {
            return state.copy(currentPlayer = if(state.currentPlayer == "X") "O" else "X")
        }
        is SetWinner -> {
            return state.copy(winner = action.winner)
        }
        is ResetGame -> {
            return GameState();
        }
    }

    return state
}