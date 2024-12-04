package com.example.projet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecetteScreen(recipe: String, onBack: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Détails des Recettes") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Retour")
                    }
                }
            )
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            // Cake
            Image(
                painter = painterResource(id = R.drawable.cake),
                contentDescription = "Cake",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(bottom = 8.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Recette du Cake :\n" +
                        "• 200g de farine\n" +
                        "• 150g de sucre\n" +
                        "• 3 œufs\n" +
                        "• 100ml de lait\n" +
                        "• 1 sachet de levure\n" +
                        "• Mélangez les ingrédients, versez dans un moule et enfournez à 180°C pendant 40 minutes.",
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Tajine
            Image(
                painter = painterResource(id = R.drawable.tajine),
                contentDescription = "Tajine",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(bottom = 8.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Recette du Tajine :\n" +
                        "• 500g de viande (agneau ou poulet)\n" +
                        "• 2 oignons, émincés\n" +
                        "• 3 carottes et 2 pommes de terre\n" +
                        "• Épices : curcuma, gingembre, cannelle\n" +
                        "• Faites mijoter avec un verre d'eau et servez chaud.",
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Soupe
            Image(
                painter = painterResource(id = R.drawable.soupe),
                contentDescription = "Soupe",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(bottom = 8.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Recette de la Soupe :\n" +
                        "• 1 litre d'eau\n" +
                        "• 4 carottes, 2 pommes de terre, 1 poireau\n" +
                        "• Cube de bouillon\n" +
                        "• Faites cuire les légumes, mixez, et servez avec des croûtons.",
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Pasta
            Image(
                painter = painterResource(id = R.drawable.pasta),
                contentDescription = "Pasta",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(bottom = 8.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Recette de la Pasta :\n" +
                        "• 200g de pâtes\n" +
                        "• 100g de sauce tomate\n" +
                        "• 50g de parmesan\n" +
                        "• Faites cuire les pâtes, ajoutez la sauce et servez avec du parmesan.",
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Pizza
            Image(
                painter = painterResource(id = R.drawable.pizza),
                contentDescription = "Pizza",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(bottom = 8.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Recette de la Pizza :\n" +
                        "• Pâte à pizza\n" +
                        "• Sauce tomate, mozzarella, et garnitures au choix\n" +
                        "• Étalez la pâte, ajoutez les ingrédients, et enfournez à 220°C pendant 15 minutes.",
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
    }
}


