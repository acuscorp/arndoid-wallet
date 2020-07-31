package com.cristianvillamil.platziwallet.ui.commands

import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import java.io.IOException
import java.io.OutputStreamWriter

class SaveCommand : FileCommand {
	override fun execute(context: Context, filename: String, vararg arguments: String) {
		try {
			var argumentsString = ""
			arguments.forEach { argumentsString = argumentsString + "\n"+it }
			val outputStreamWriter = OutputStreamWriter(context.openFileOutput(filename,Context.MODE_PRIVATE))
			outputStreamWriter.write(argumentsString)
			outputStreamWriter.close()
		} catch (e: IOException) {
			Log.e(TAG, "No se pudo escribir en el archivo: $e")
		}

	}
}