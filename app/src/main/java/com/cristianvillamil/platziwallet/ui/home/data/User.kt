package com.cristianvillamil.platziwallet.ui.home.data

import android.provider.ContactsContract

class User private constructor(private val userName : String, private val password : String ) {
	class Builder{
		private var userName : String = "";
		private var password : String? = null
		private var nickNanme : String? = null

		fun setUserName(userName : String): Builder {
			this.userName = userName
			return this //return this instance
		}
		fun setPassword(password : String) :Builder {
			this.password = password
			return this //return this instance
		}
		fun setNickName(newNickname: String) = apply { this.nickNanme = newNickname  }

		fun build(): User {
			return User(userName,password?:"")
		}
	}

}