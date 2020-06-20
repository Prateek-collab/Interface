class CallMe:Myinterface,NewInterface {

    override fun hello(){
        println("Function hello is called here")
    }
    override fun greeting(){
        println("New greeting can be given here")
    }
    override  fun newMethod(){
        println("Function of New Interface")
    }

}