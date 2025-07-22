package org.neutrofit.shared

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import neutofit.shared.generated.resources.Res
import neutofit.shared.generated.resources.bebas_neue_regular
import org.jetbrains.compose.resources.Font


@Composable
fun  BebasNeueFont() = FontFamily(Font(resource = Res.font.bebas_neue_regular))


@Composable
fun  RobotoCondensedFont() = FontFamily(Font(resource = Res.font.bebas_neue_regular))

object FontSize {
    val EXTRA_SMALL = 10.sp
    val SMALL = 12.sp
    val REGULAR = 14.sp
    val EXTRA_REGULAR = 16.sp
    val MEDIUM = 18.sp
    val EXTRA_MEDIUM = 20.sp
    val LARGE = 30.sp
    val EXTRA_LARGE = 40.sp
}