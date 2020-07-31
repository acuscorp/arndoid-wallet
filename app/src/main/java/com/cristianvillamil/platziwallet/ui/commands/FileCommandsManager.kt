package com.cristianvillamil.platziwallet.ui.commands

import java.lang.RuntimeException


class FileCommandsManager {
	private val commands : HashMap<String,FileCommand> = HashMap()

	fun putCommand(commandName:String, fileCommand: FileCommand){
		commands.put(commandName,fileCommand)
	}

	fun getCommand(commandName: String):FileCommand{
		return commands.get(commandName)?:throw RuntimeException("Comando $commandName no está registrdo")
	}
}