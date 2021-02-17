package io.ere.icacoe.kotlin.store.board

import io.ere.icacoe.kotlin.store.board.BoardState
import org.rekotlin.Action

fun boardReducer(action: Action, state: BoardState = BoardState()): BoardState {
    when (action) {
        is AddPlayerMove -> {
            var positions = state?.positions?.map ({position -> position });
            return state.copy(positions = positions)
        }
        is ResetBoard -> {
            return BoardState();
        }
    }

    return state
}