package com.example.projet

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(onLogout: () -> Unit, onRecipeClick: (String) -> Unit) {
    var recipe by rememberSaveable(stateSaver = TextFieldValue.Saver) { mutableStateOf(TextFieldValue("")) } // TextField for recipe input
    var recipes by rememberSaveable { mutableStateOf(listOf<String>()) } // List to hold recipes

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            // Liste des recettes sous forme de boutons
            if (recipes.isNotEmpty()) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    recipes.forEachIndexed { index, recipe ->
                        Button(
                            onClick = { onRecipeClick(recipe) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                        ) {
                            Text(text = "Recette #${index + 1}")
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
            }

            // Champ d'entrée pour ajouter une recette
            OutlinedTextField(
                value = recipe,
                onValueChange = { recipe = it },
                label = { Text("Ajouter une recette") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = false
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Bouton pour ajouter une recette
            Button(
                onClick = {
                    if (recipe.text.isNotEmpty()) {
                        recipes = recipes + recipe.text // Ajouter la recette à la liste
                        recipe = TextFieldValue("") // Réinitialiser le champ de texte
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                enabled = recipe.text.isNotEmpty()
            ) {
                Text("Ajouter la recette")
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Bouton pour supprimer la dernière recette
            Button(
                onClick = {
                    if (recipes.isNotEmpty()) {
                        recipes = recipes.dropLast(1) // Supprimer la dernière recette
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                enabled = recipes.isNotEmpty()
            ) {
                Text("Supprimer la dernière recette")
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Bouton de déconnexion
            Button(
                onClick = onLogout,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Se déconnecter")
            }
        }
    }
}
