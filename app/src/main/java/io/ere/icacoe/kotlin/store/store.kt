package io.ere.icacoe.kotlin.store

import io.ere.icacoe.kotlin.store.board.BoardState
import io.ere.icacoe.kotlin.store.game.GameState
import org.rekotlin.StateType

data class AppState(
    var boardState: BoardState,
    var gameState: GameState
): StateType