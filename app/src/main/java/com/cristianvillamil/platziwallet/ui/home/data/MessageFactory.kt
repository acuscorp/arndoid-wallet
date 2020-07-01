package com.cristianvillamil.platziwallet.ui.home.data

import android.app.AlertDialog
import android.content.Context

class MessageFactory {
	companion object{
		val TYPE_ERROR = "typeError"
		val TYPE_SUCCESS = "typeSuccess"
	}
	fun getDialog(context : Context, type : String): AlertDialog.Builder{
		when(type){
			TYPE_SUCCESS -> {
				return AlertDialog.Builder(context)
					.setMessage("El contenido fue cargado exitosamente")
			}
			TYPE_ERROR -> {
				return AlertDialog.Builder(context)
					.setMessage("Hay un error al momento de el contenido")
			}
		}
		return AlertDialog.Builder(context)
			.setMessage("Crear el nuevo tipo")
	}
}