package io.ere.icacoe.kotlin.views.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import io.ere.icacoe.kotlin.R
import io.ere.icacoe.kotlin.store.AppState
import io.ere.icacoe.kotlin.store.store
import org.rekotlin.StoreSubscriber

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class GameFragment : Fragment(), StoreSubscriber<AppState> {

    private val winnerText: TextView by lazy {
        view?.findViewById(R.id.text_view_winner) as TextView
    }

    private val scoreButton: Button by lazy {
        view?.findViewById(R.id.button_view_score) as Button
    }

    // Board Buttons
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        store.subscribe(this);

        scoreButton.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_ThirdFragment)
        }
    }

    // componentDidUpdate
    override fun newState(state: AppState) {
        winnerText.text = state.gameState.winner ?: ""
        scoreButton.visibility = if (state.gameState.winner != null) Button.VISIBLE else Button.INVISIBLE
    }

    override fun onDestroy() {
        super.onDestroy()
        store.unsubscribe(this);
    }
}