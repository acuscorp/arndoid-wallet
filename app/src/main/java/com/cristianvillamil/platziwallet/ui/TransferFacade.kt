package com.cristianvillamil.platziwallet.ui

class TransferFacade {
	val analiticsManager = AnaliticsManager()
	val securityManager = SecurityManager()
	val transferManager = TransferManager()

	fun transfer(){
		val token = securityManager.getToken()
		analiticsManager.registerTransfer(token)
		transferManager.transfer(token)

	}

}