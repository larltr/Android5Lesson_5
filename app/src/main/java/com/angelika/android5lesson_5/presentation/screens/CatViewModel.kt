package com.angelika.android5lesson_5.presentation.screens

import androidx.lifecycle.ViewModel
import com.angelika.android5lesson_5.data.model.CatModel
import kotlinx.coroutines.flow.MutableStateFlow

class CatViewModel: ViewModel() {

    val catState = MutableStateFlow<MutableList<CatModel>>(mutableListOf())

    init {
        fetchCatList()
    }

    private fun fetchCatList() {
        catState.value.apply {
            add(CatModel("https://petsi.net/images/catbreed/small/abissinskaya-koshka.jpg", "Абиссинская кошка"))
            add(CatModel("https://petsi.net/images/catbreed/small/avstraliyskaya-dymchataya.jpg", "Австралийская дымчатая"))
            add(CatModel("https://petsi.net/images/catbreed/small/aziatskaya-tabbi.jpg", "Азиатская табби"))
            add(CatModel("https://petsi.net/images/catbreed/small/amerikanskaya-dlinnosherstnaya-koshka.jpg", "Американская длинношерстная"))
            add(CatModel("https://petsi.net/images/catbreed/small/amerikanskaya-zhestkosherstnaya.jpg", "Американская жесткошерстная"))
            add(CatModel("https://petsi.net/images/catbreed/small/amerikanskaya-korotkosherstnaya.jpg", "Американская короткошерстная"))
            add(CatModel("https://petsi.net/images/catbreed/small/amerikanskiy-bobteyl.jpg", "Американский бобтейл"))
            add(CatModel("https://petsi.net/images/catbreed/small/amerikanskiy-kerl.jpg", "Американский керл"))
            add(CatModel("https://petsi.net/images/catbreed/small/anatoliyskaya-koshka.jpg", "Анатолийская кошка"))
            add(CatModel("https://petsi.net/images/catbreed/small/arabskiy-mau.jpg", "Арабский мау (аравийский мау)"))
            add(CatModel("https://petsi.net/images/catbreed/small/ashera.jpg", "Ашера"))
            add(CatModel("https://petsi.net/images/catbreed/small/balineziyskaya-koshka.jpg", "Балинезийская кошка (балинез, балийская кошка)"))
            add(CatModel("https://petsi.net/images/catbreed/small/bambino.jpg", "Бамбино"))
            add(CatModel("https://petsi.net/images/catbreed/small/bengalskaya-koshka.jpg", "Бенгальская кошка"))
            add(CatModel("https://petsi.net/images/catbreed/small/birmanskaya-koshka.jpg", "Бирманская кошка (Священная бирма)"))
            add(CatModel("https://petsi.net/images/catbreed/small/bombeyskaya.jpg", "Бразильская короткошерстная кошка"))
            add(CatModel("https://petsi.net/images/catbreed/small/brazilskaya-korotkosherstnaya-koshka.jpg", "Бомбейская кошка"))
            add(CatModel("https://petsi.net/images/catbreed/small/britanskaya-dlinnosherstnaya-koshka.jpg", "Британская длинношерстная кошка"))
        }
    }
}