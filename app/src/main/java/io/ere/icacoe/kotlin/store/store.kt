package io.ere.icacoe.kotlin.store

import io.ere.icacoe.kotlin.store.board.BoardState
import io.ere.icacoe.kotlin.store.game.GameState
import io.ere.icacoe.kotlin.store.board.boardMiddleware
import io.ere.icacoe.kotlin.store.game.gameMiddleware
import org.rekotlin.StateType
import org.rekotlin.Store

data class AppState(
    var boardState: BoardState = BoardState(),
    var gameState: GameState = GameState()
): StateType


var store = Store(
    state = AppState(),
    reducer = ::appReducer,
    middleware = arrayListOf(gameMiddleware, boardMiddleware)
);