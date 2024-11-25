package com.syedsaifhossain.necterappproject.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun SearchScreenComponent(
    modifier: Modifier = Modifier,
    query: String,
    onQueryChanged: (String) -> Unit,
    onSearched: (String) -> Unit,
    active: Boolean,
    onActiveChanged: (Boolean) -> Unit,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    shape: Shape,
) {


    SearchBar(modifier = modifier,
        query = query,
        onQueryChange = onQueryChanged,
        onSearch = onSearched,
        active = active,
        onActiveChange = onActiveChanged,
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        shape = shape
    ) { }

}