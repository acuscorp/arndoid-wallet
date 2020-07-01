package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.ui.UserSingleton
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor
import com.cristianvillamil.platziwallet.ui.home.data.User

class HomePresenter(private val view: HomeContract.View) : HomeContract.Presenter {
	private val homeInteractor = HomeInteractor()
	override fun retriveFavoriteTransfers() {

		view.showLoader()
		homeInteractor.retrieveFavoriteTransferFromCache(object : HomeContract.OnResponseCallback {
			override fun onResponse(favoriteTransfer: List<FavoriteTransfer>) {
				UserSingleton.getInstance()
				val user = User.Builder()
					.setUserName("noe")
					.setPassword("\"Adrian2310")
					.setNickName("nelo")
					.build()
				view.hideLoader()
				view.showFavoriteTransfers(favoriteTransfer)

			}
		})
	}


}