package com.mwendwa.homescreens.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mwendwa.homescreens.ui.theme.Screens.About.AboutScreen
import com.mwendwa.homescreens.ui.theme.Screens.Gallery.GalleryScreen
import com.mwendwa.homescreens.ui.theme.Screens.Home.HomeScreen
import com.mwendwa.homescreens.ui.theme.Screens.Login.LoginScreen
import com.mwendwa.homescreens.ui.theme.Screens.Profile.ProfileScreen
import com.mwendwa.homescreens.ui.theme.Screens.Register.RegisterScreen
import com.mwendwa.homescreens.ui.theme.Screens.products.AddProductsScreen
import com.mwendwa.homescreens.ui.theme.Screens.products.UpdateProductsScreen
import com.mwendwa.homescreens.ui.theme.Screens.products.ViewProductsScreen
import com.mwendwa.homescreens.ui.theme.Screens.products.ViewUploadsScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination:String = ROUTE_REGISTER){
                   NavHost(
                       navController = navController,
                       modifier = modifier,
                       startDestination = startDestination ){
                       composable(ROUTE_HOME){ HomeScreen(navController)}
                       composable(ROUTE_ABOUT){ AboutScreen(navController) }
                       composable(ROUTE_REGISTER){ RegisterScreen(navController)}
                       composable(ROUTE_LOGIN){ LoginScreen(navController)}
                       composable(ROUTE_GALLERY){ GalleryScreen(navController)}
                       composable(ROUTE_PROFILE){ ProfileScreen(navController)}
                       composable(ROUTE_ADD_PRODUCT){ AddProductsScreen(navController)}
                       composable(ROUTE_VIEW_PRODUCT){ ViewProductsScreen(navController)}
                       composable(ROUTE_VIEW_UPLOAD){ ViewUploadsScreen(navController)}
                       composable(ROUTE_UPDATE_PRODUCT+"/{id}"){
                           passedData ->
                           UpdateProductsScreen(
                               navController,passedData.arguments?.getString("id")!!
                           )
                       }
                   }

}


