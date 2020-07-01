package com.cristianvillamil.platziwallet.ui

class UserSingleton {
	var userName = "noe"
	companion object{
		private var instance : UserSingleton? = null;
		fun getInstance(): UserSingleton {
			if(instance==null){
				instance = UserSingleton()
			}
			return instance as UserSingleton
		}
	}

}