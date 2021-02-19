package io.ere.icacoe.kotlin.store.board

import io.ere.icacoe.kotlin.store.AppState
import io.ere.icacoe.kotlin.store.game.CheckWinner
import io.ere.icacoe.kotlin.store.game.SetWinner
import io.ere.icacoe.kotlin.store.game.ToggleCurrentPlayer
import org.rekotlin.Action
import org.rekotlin.DispatchFunction
import org.rekotlin.Middleware

fun addPlayeMove(action: AddPlayerMove, dispatch: DispatchFunction, getState: () -> AppState?) {
    dispatch(AddPlayerMove(position =  action.position, player = action.player));
    dispatch(CheckWinner());

    var winner = getState()?.gameState?.winner;
    if (winner == null) {
        dispatch(ToggleCurrentPlayer())
    }
}

internal val boardMiddleware: Middleware<AppState> = { dispatch, getState ->
    { next ->
        { action ->
            when (action) {
                is AddPlayerMove -> {
                    addPlayeMove(action, dispatch, getState);
                }
            }

            next(action)

        }
    }
}