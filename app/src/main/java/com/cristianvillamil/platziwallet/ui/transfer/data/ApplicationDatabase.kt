package com.cristianvillamil.platziwallet.ui.transfer.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [TransferEntity::class], version = 1)
abstract class ApplicationDatabase : RoomDatabase() {

	abstract fun getDAO() : TransfersDAO


		companion object{
		private var INSTANCE : ApplicationDatabase? = null

		fun getInstance(context:Context): ApplicationDatabase{
			if(INSTANCE==null){
				INSTANCE = Room.databaseBuilder(
					context.applicationContext,
					ApplicationDatabase::class.java,
					"platzyWalletDatabase"
				).allowMainThreadQueries().build()

			}
			return INSTANCE as ApplicationDatabase
		}
		fun destroyInstance() {
			INSTANCE = null
		}

	}




}