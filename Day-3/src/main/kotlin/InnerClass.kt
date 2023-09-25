fun main(){
    val list = ListView(arrayOf("Apple","Banana","Chicku","Dragon Fruit"))
    var item = list.ListViewItem().getItem(1)
    println(item)
}
                                   // Inner Class :
class ListView(val items:Array<String>) {
    inner class ListViewItem(){  // This is how we can declare inner class inside anaother class
        fun getItem(position:Int):String{
            return items[position]
        }
    }
}