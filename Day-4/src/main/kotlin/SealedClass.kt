fun main(){
    val success = Result.Success("Success!")
    val progress = Result.Progress("Progress...")
    getData(success)
    getData(progress)
    val recoverableError = Result.Error.RecoverableError(Exception("Recoverable error occurred"),"Recoverable Error!")
    val nonRecoverableError = Result.Error.NonRecoverableError(Exception("Non-recoverable error occurred"), "Non-Recoverable Error!")
    getData(recoverableError)
    getData(nonRecoverableError)
}

fun getData(result:Result){
    when(result){
        is Result.Success -> result.showMessage()
        is Result.Progress -> result.showMessage()
        is Result.Error.NonRecoverableError -> result.showMessage()
        is Result.Error.RecoverableError -> result.showMessage()
    }
}
                                             // Sealed Class :
sealed class Result(var message:String){
    fun showMessage(){
        println("Message: $message")
    }
    class Success(message: String):Result(message)
    sealed class Error(message: String):Result(message){
        class RecoverableError(exception: Exception,message: String):Error(message)
        class NonRecoverableError(exception: Exception,message: String):Error(message)
    }
    class Progress(message: String):Result(message)
}