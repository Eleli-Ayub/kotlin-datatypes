open class Car(var brand: String, var model:String) {
    init{
        this.brand = brand
        this.model = model
        println(brand + " " + model)
    }
}