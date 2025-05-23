/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("COMPOSABLE_FUNCTION_REFERENCE")

package com.emertozd.compose.catalog.library.model

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.adaptive.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.emertozd.compose.catalog.library.util.AdaptiveNavigationSuiteSampleSourceUrl
import com.emertozd.compose.catalog.library.util.AdaptiveSampleSourceUrl
import com.emertozd.compose.catalog.library.util.SampleSourceUrl
import com.emertozd.compose.catalog.samples.AlertDialogSample
import com.emertozd.compose.catalog.samples.AlertDialogWithIconSample
import com.emertozd.compose.catalog.samples.AllShapes
import com.emertozd.compose.catalog.samples.AnimatedExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.AnimatedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.AssistChipSample
import com.emertozd.compose.catalog.samples.BasicAlertDialogSample
import com.emertozd.compose.catalog.samples.BottomAppBarWithFAB
import com.emertozd.compose.catalog.samples.BottomAppBarWithOverflow
import com.emertozd.compose.catalog.samples.BottomSheetScaffoldNestedScrollSample
import com.emertozd.compose.catalog.samples.ButtonGroupSample
import com.emertozd.compose.catalog.samples.ButtonSample
import com.emertozd.compose.catalog.samples.ButtonWithAnimatedShapeSample
import com.emertozd.compose.catalog.samples.ButtonWithIconSample
import com.emertozd.compose.catalog.samples.CardSample
import com.emertozd.compose.catalog.samples.CenteredHorizontalFloatingToolbarWithFabSample
import com.emertozd.compose.catalog.samples.CenteredSliderSample
import com.emertozd.compose.catalog.samples.CenteredVerticalFloatingToolbarWithFabSample
import com.emertozd.compose.catalog.samples.CheckboxRoundedStrokesSample
import com.emertozd.compose.catalog.samples.CheckboxSample
import com.emertozd.compose.catalog.samples.CheckboxWithTextSample
import com.emertozd.compose.catalog.samples.ChipGroupReflowSample
import com.emertozd.compose.catalog.samples.ChipGroupSingleLineSample
import com.emertozd.compose.catalog.samples.CircularProgressIndicatorSample
import com.emertozd.compose.catalog.samples.CircularWavyProgressIndicatorSample
import com.emertozd.compose.catalog.samples.ClickableCardSample
import com.emertozd.compose.catalog.samples.ClickableElevatedCardSample
import com.emertozd.compose.catalog.samples.ClickableOutlinedCardSample
import com.emertozd.compose.catalog.samples.ContainedLoadingIndicatorSample
import com.emertozd.compose.catalog.samples.CustomTwoRowsTopAppBar
import com.emertozd.compose.catalog.samples.DateInputSample
import com.emertozd.compose.catalog.samples.DatePickerDialogSample
import com.emertozd.compose.catalog.samples.DatePickerSample
import com.emertozd.compose.catalog.samples.DatePickerWithDateSelectableDatesSample
import com.emertozd.compose.catalog.samples.DateRangePickerSample
import com.emertozd.compose.catalog.samples.DenseTextFieldContentPadding
import com.emertozd.compose.catalog.samples.DeterminateContainedLoadingIndicatorSample
import com.emertozd.compose.catalog.samples.DeterminateLoadingIndicatorSample
import com.emertozd.compose.catalog.samples.DismissibleModalWideNavigationRailSample
import com.emertozd.compose.catalog.samples.DismissibleNavigationDrawerSample
import com.emertozd.compose.catalog.samples.DockedSearchBarScaffoldSample
import com.emertozd.compose.catalog.samples.EditableExposedDropdownMenuSample
import com.emertozd.compose.catalog.samples.ElevatedAssistChipSample
import com.emertozd.compose.catalog.samples.ElevatedButtonSample
import com.emertozd.compose.catalog.samples.ElevatedButtonWithAnimatedShapeSample
import com.emertozd.compose.catalog.samples.ElevatedCardSample
import com.emertozd.compose.catalog.samples.ElevatedFilterChipSample
import com.emertozd.compose.catalog.samples.ElevatedSplitButtonSample
import com.emertozd.compose.catalog.samples.ElevatedSuggestionChipSample
import com.emertozd.compose.catalog.samples.ElevatedToggleButtonSample
import com.emertozd.compose.catalog.samples.EnterAlwaysTopAppBar
import com.emertozd.compose.catalog.samples.ExitAlwaysBottomAppBar
import com.emertozd.compose.catalog.samples.ExitAlwaysBottomAppBarFixed
import com.emertozd.compose.catalog.samples.ExitAlwaysBottomAppBarFixedVibrant
import com.emertozd.compose.catalog.samples.ExitAlwaysBottomAppBarSpacedAround
import com.emertozd.compose.catalog.samples.ExitAlwaysBottomAppBarSpacedBetween
import com.emertozd.compose.catalog.samples.ExitAlwaysBottomAppBarSpacedEvenly
import com.emertozd.compose.catalog.samples.ExitUntilCollapsedCenterAlignedLargeFlexibleTopAppBar
import com.emertozd.compose.catalog.samples.ExitUntilCollapsedCenterAlignedMediumFlexibleTopAppBar
import com.emertozd.compose.catalog.samples.ExitUntilCollapsedLargeTopAppBar
import com.emertozd.compose.catalog.samples.ExitUntilCollapsedMediumTopAppBar
import com.emertozd.compose.catalog.samples.ExpandableHorizontalFloatingToolbarSample
import com.emertozd.compose.catalog.samples.ExpandableVerticalFloatingToolbarSample
import com.emertozd.compose.catalog.samples.ExposedDropdownMenuSample
import com.emertozd.compose.catalog.samples.ExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.ExtendedFloatingActionButtonTextSample
import com.emertozd.compose.catalog.samples.ExtraLargeFilledSplitButtonSample
import com.emertozd.compose.catalog.samples.ExtraSmallNarrowSquareIconButtonsSample
import com.emertozd.compose.catalog.samples.FadingHorizontalMultiBrowseCarouselSample
import com.emertozd.compose.catalog.samples.FancyIndicatorContainerTabs
import com.emertozd.compose.catalog.samples.FancyIndicatorTabs
import com.emertozd.compose.catalog.samples.FancyTabs
import com.emertozd.compose.catalog.samples.FilledIconButtonSample
import com.emertozd.compose.catalog.samples.FilledIconToggleButtonSample
import com.emertozd.compose.catalog.samples.FilledSplitButtonSample
import com.emertozd.compose.catalog.samples.FilledTonalButtonSample
import com.emertozd.compose.catalog.samples.FilledTonalButtonWithAnimatedShapeSample
import com.emertozd.compose.catalog.samples.FilledTonalIconButtonSample
import com.emertozd.compose.catalog.samples.FilledTonalIconToggleButtonSample
import com.emertozd.compose.catalog.samples.FilterChipSample
import com.emertozd.compose.catalog.samples.FilterChipWithLeadingIconSample
import com.emertozd.compose.catalog.samples.FloatingActionButtonMenuSample
import com.emertozd.compose.catalog.samples.FloatingActionButtonSample
import com.emertozd.compose.catalog.samples.FullScreenSearchBarScaffoldSample
import com.emertozd.compose.catalog.samples.HorizontalFloatingToolbarAsScaffoldFabSample
import com.emertozd.compose.catalog.samples.HorizontalFloatingToolbarWithFabSample
import com.emertozd.compose.catalog.samples.HorizontalMultiBrowseCarouselSample
import com.emertozd.compose.catalog.samples.HorizontalUncontainedCarouselSample
import com.emertozd.compose.catalog.samples.IconButtonSample
import com.emertozd.compose.catalog.samples.IconToggleButtonSample
import com.emertozd.compose.catalog.samples.IndeterminateCircularProgressIndicatorSample
import com.emertozd.compose.catalog.samples.IndeterminateCircularWavyProgressIndicatorSample
import com.emertozd.compose.catalog.samples.IndeterminateLinearProgressIndicatorSample
import com.emertozd.compose.catalog.samples.IndeterminateLinearWavyProgressIndicatorSample
import com.emertozd.compose.catalog.samples.InputChipSample
import com.emertozd.compose.catalog.samples.InputChipWithAvatarSample
import com.emertozd.compose.catalog.samples.LargeAnimatedExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.LargeButtonWithIconSample
import com.emertozd.compose.catalog.samples.LargeExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.LargeExtendedFloatingActionButtonTextSample
import com.emertozd.compose.catalog.samples.LargeFilledSplitButtonSample
import com.emertozd.compose.catalog.samples.LargeFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.LargeRoundUniformOutlinedIconButtonSample
import com.emertozd.compose.catalog.samples.LargeToggleButtonWithIconSample
import com.emertozd.compose.catalog.samples.LeadingIconTabs
import com.emertozd.compose.catalog.samples.LinearProgressIndicatorSample
import com.emertozd.compose.catalog.samples.LinearWavyProgressIndicatorSample
import com.emertozd.compose.catalog.samples.ListDetailPaneScaffoldSample
import com.emertozd.compose.catalog.samples.ListDetailPaneScaffoldSampleWithExtraPane
import com.emertozd.compose.catalog.samples.LoadingIndicatorPullToRefreshSample
import com.emertozd.compose.catalog.samples.LoadingIndicatorSample
import com.emertozd.compose.catalog.samples.MediumAnimatedExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.MediumButtonWithIconSample
import com.emertozd.compose.catalog.samples.MediumExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.MediumExtendedFloatingActionButtonTextSample
import com.emertozd.compose.catalog.samples.MediumFilledSplitButtonSample
import com.emertozd.compose.catalog.samples.MediumFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.MediumRoundWideIconButtonSample
import com.emertozd.compose.catalog.samples.MediumToggleButtonWithIconSample
import com.emertozd.compose.catalog.samples.MenuSample
import com.emertozd.compose.catalog.samples.MenuWithScrollStateSample
import com.emertozd.compose.catalog.samples.ModalBottomSheetSample
import com.emertozd.compose.catalog.samples.ModalNavigationDrawerSample
import com.emertozd.compose.catalog.samples.ModalWideNavigationRailSample
import com.emertozd.compose.catalog.samples.MultiAutocompleteExposedDropdownMenuSample
import com.emertozd.compose.catalog.samples.MultiSelectConnectedButtonGroupSample
import com.emertozd.compose.catalog.samples.NavigableListDetailPaneScaffoldSample
import com.emertozd.compose.catalog.samples.NavigationBarItemWithBadge
import com.emertozd.compose.catalog.samples.NavigationBarSample
import com.emertozd.compose.catalog.samples.NavigationBarWithOnlySelectedLabelsSample
import com.emertozd.compose.catalog.samples.NavigationRailBottomAlignSample
import com.emertozd.compose.catalog.samples.NavigationRailSample
import com.emertozd.compose.catalog.samples.NavigationRailWithOnlySelectedLabelsSample
import com.emertozd.compose.catalog.samples.NavigationSuiteScaffoldCustomConfigSample
import com.emertozd.compose.catalog.samples.NavigationSuiteScaffoldSample
import com.emertozd.compose.catalog.samples.OneLineListItem
import com.emertozd.compose.catalog.samples.OutlinedButtonSample
import com.emertozd.compose.catalog.samples.OutlinedButtonWithAnimatedShapeSample
import com.emertozd.compose.catalog.samples.OutlinedCardSample
import com.emertozd.compose.catalog.samples.OutlinedIconButtonSample
import com.emertozd.compose.catalog.samples.OutlinedIconToggleButtonSample
import com.emertozd.compose.catalog.samples.OutlinedSplitButtonSample
import com.emertozd.compose.catalog.samples.OutlinedTextFieldWithInitialValueAndSelection
import com.emertozd.compose.catalog.samples.OutlinedToggleButtonSample
import com.emertozd.compose.catalog.samples.OverflowingHorizontalFloatingToolbarSample
import com.emertozd.compose.catalog.samples.OverflowingVerticalFloatingToolbarSample
import com.emertozd.compose.catalog.samples.PasswordTextField
import com.emertozd.compose.catalog.samples.PermanentNavigationDrawerSample
import com.emertozd.compose.catalog.samples.PinnedTopAppBar
import com.emertozd.compose.catalog.samples.PlainTooltipSample
import com.emertozd.compose.catalog.samples.PlainTooltipWithCaret
import com.emertozd.compose.catalog.samples.PlainTooltipWithCustomCaret
import com.emertozd.compose.catalog.samples.PlainTooltipWithManualInvocationSample
import com.emertozd.compose.catalog.samples.PrimaryIconTabs
import com.emertozd.compose.catalog.samples.PrimaryTextTabs
import com.emertozd.compose.catalog.samples.PullToRefreshCustomIndicatorWithDefaultTransform
import com.emertozd.compose.catalog.samples.PullToRefreshSample
import com.emertozd.compose.catalog.samples.PullToRefreshSampleCustomState
import com.emertozd.compose.catalog.samples.PullToRefreshScalingSample
import com.emertozd.compose.catalog.samples.PullToRefreshViewModelSample
import com.emertozd.compose.catalog.samples.PullToRefreshWithLoadingIndicatorSample
import com.emertozd.compose.catalog.samples.RadioButtonSample
import com.emertozd.compose.catalog.samples.RadioGroupSample
import com.emertozd.compose.catalog.samples.RangeSliderSample
import com.emertozd.compose.catalog.samples.RangeSliderWithCustomComponents
import com.emertozd.compose.catalog.samples.RichTooltipSample
import com.emertozd.compose.catalog.samples.RichTooltipWithCaretSample
import com.emertozd.compose.catalog.samples.RichTooltipWithCustomCaretSample
import com.emertozd.compose.catalog.samples.RichTooltipWithManualInvocationSample
import com.emertozd.compose.catalog.samples.ScaffoldWithCoroutinesSnackbar
import com.emertozd.compose.catalog.samples.ScaffoldWithCustomSnackbar
import com.emertozd.compose.catalog.samples.ScaffoldWithIndefiniteSnackbar
import com.emertozd.compose.catalog.samples.ScaffoldWithMultilineSnackbar
import com.emertozd.compose.catalog.samples.ScaffoldWithSimpleSnackbar
import com.emertozd.compose.catalog.samples.ScrollableHorizontalFloatingToolbarSample
import com.emertozd.compose.catalog.samples.ScrollableVerticalFloatingToolbarSample
import com.emertozd.compose.catalog.samples.ScrollingFancyIndicatorContainerTabs
import com.emertozd.compose.catalog.samples.ScrollingPrimaryTextTabs
import com.emertozd.compose.catalog.samples.ScrollingSecondaryTextTabs
import com.emertozd.compose.catalog.samples.SecondaryIconTabs
import com.emertozd.compose.catalog.samples.SecondaryTextTabs
import com.emertozd.compose.catalog.samples.SegmentedButtonMultiSelectSample
import com.emertozd.compose.catalog.samples.SegmentedButtonSingleSelectSample
import com.emertozd.compose.catalog.samples.ShortNavigationBarSample
import com.emertozd.compose.catalog.samples.ShortNavigationBarWithHorizontalItemsSample
import com.emertozd.compose.catalog.samples.SimpleBottomAppBar
import com.emertozd.compose.catalog.samples.SimpleBottomSheetScaffoldSample
import com.emertozd.compose.catalog.samples.SimpleCenterAlignedTopAppBar
import com.emertozd.compose.catalog.samples.SimpleCenterAlignedTopAppBarWithSubtitle
import com.emertozd.compose.catalog.samples.SimpleOutlinedTextFieldSample
import com.emertozd.compose.catalog.samples.SimpleSearchBarSample
import com.emertozd.compose.catalog.samples.SimpleTextFieldSample
import com.emertozd.compose.catalog.samples.SimpleTopAppBar
import com.emertozd.compose.catalog.samples.SimpleTopAppBarWithAdaptiveActions
import com.emertozd.compose.catalog.samples.SimpleTopAppBarWithSubtitle
import com.emertozd.compose.catalog.samples.SingleSelectConnectedButtonGroupSample
import com.emertozd.compose.catalog.samples.SingleSelectConnectedButtonGroupWithFlowLayoutSample
import com.emertozd.compose.catalog.samples.SliderSample
import com.emertozd.compose.catalog.samples.SliderWithCustomThumbSample
import com.emertozd.compose.catalog.samples.SliderWithCustomTrackAndThumbSample
import com.emertozd.compose.catalog.samples.SliderWithTrackIconsSample
import com.emertozd.compose.catalog.samples.SmallAnimatedExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.SmallButtonSample
import com.emertozd.compose.catalog.samples.SmallExtendedFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.SmallExtendedFloatingActionButtonTextSample
import com.emertozd.compose.catalog.samples.SmallFloatingActionButtonSample
import com.emertozd.compose.catalog.samples.SplitButtonWithDropdownMenuSample
import com.emertozd.compose.catalog.samples.SplitButtonWithIconSample
import com.emertozd.compose.catalog.samples.SplitButtonWithTextSample
import com.emertozd.compose.catalog.samples.SplitButtonWithUnCheckableTrailingButtonSample
import com.emertozd.compose.catalog.samples.SquareButtonSample
import com.emertozd.compose.catalog.samples.SquareToggleButtonSample
import com.emertozd.compose.catalog.samples.StepRangeSliderSample
import com.emertozd.compose.catalog.samples.StepsSliderSample
import com.emertozd.compose.catalog.samples.SuggestionChipSample
import com.emertozd.compose.catalog.samples.SwitchSample
import com.emertozd.compose.catalog.samples.SwitchWithThumbIconSample
import com.emertozd.compose.catalog.samples.TextAndIconTabs
import com.emertozd.compose.catalog.samples.TextArea
import com.emertozd.compose.catalog.samples.TextButtonSample
import com.emertozd.compose.catalog.samples.TextButtonWithAnimatedShapeSample
import com.emertozd.compose.catalog.samples.TextFieldWithErrorState
import com.emertozd.compose.catalog.samples.TextFieldWithHideKeyboardOnImeAction
import com.emertozd.compose.catalog.samples.TextFieldWithIcons
import com.emertozd.compose.catalog.samples.TextFieldWithInitialValueAndSelection
import com.emertozd.compose.catalog.samples.TextFieldWithPlaceholder
import com.emertozd.compose.catalog.samples.TextFieldWithPrefixAndSuffix
import com.emertozd.compose.catalog.samples.TextFieldWithSupportingText
import com.emertozd.compose.catalog.samples.TextFieldWithTransformations
import com.emertozd.compose.catalog.samples.ThreeLineListItemWithExtendedSupporting
import com.emertozd.compose.catalog.samples.ThreeLineListItemWithOverlineAndSupporting
import com.emertozd.compose.catalog.samples.TimeInputSample
import com.emertozd.compose.catalog.samples.TimePickerSample
import com.emertozd.compose.catalog.samples.TimePickerSwitchableSample
import com.emertozd.compose.catalog.samples.TintedIconButtonSample
import com.emertozd.compose.catalog.samples.ToggleButtonSample
import com.emertozd.compose.catalog.samples.ToggleButtonWithIconSample
import com.emertozd.compose.catalog.samples.TonalSplitButtonSample
import com.emertozd.compose.catalog.samples.TonalToggleButtonSample
import com.emertozd.compose.catalog.samples.TriStateCheckboxRoundedStrokesSample
import com.emertozd.compose.catalog.samples.TriStateCheckboxSample
import com.emertozd.compose.catalog.samples.TwoLineListItem
import com.emertozd.compose.catalog.samples.VerticalCenteredSliderSample
import com.emertozd.compose.catalog.samples.VerticalFloatingToolbarWithFabSample
import com.emertozd.compose.catalog.samples.VerticalSliderSample
import com.emertozd.compose.catalog.samples.WideNavigationRailArrangementsSample
import com.emertozd.compose.catalog.samples.WideNavigationRailCollapsedSample
import com.emertozd.compose.catalog.samples.WideNavigationRailExpandedSample
import com.emertozd.compose.catalog.samples.WideNavigationRailResponsiveSample
import com.emertozd.compose.catalog.samples.XLargeButtonWithIconSample
import com.emertozd.compose.catalog.samples.XLargeToggleButtonWithIconSample
import com.emertozd.compose.catalog.samples.XSmallButtonWithIconSample
import com.emertozd.compose.catalog.samples.XSmallFilledSplitButtonSample
import com.emertozd.compose.catalog.samples.XSmallToggleButtonWithIconSample

data class Example(
    val name: String,
    val description: String,
    val sourceUrl: String,
    val isExpressive: Boolean,
    val content: @Composable () -> Unit,
)

private const val AdaptiveExampleDescription = "Adaptive examples"
private const val AdaptiveExampleSourceUrl = "$AdaptiveSampleSourceUrl/ThreePaneScaffoldSamples.kt"
val AdaptiveExamples =
    listOf(
        Example(
            name = "ListDetailPaneScaffoldSample",
            description = AdaptiveExampleDescription,
            sourceUrl = AdaptiveExampleSourceUrl,
            isExpressive = false,
        ) {
            ListDetailPaneScaffoldSample()
        },
        Example(
            name = "ListDetailPaneScaffoldSampleWithExtraPane",
            description = AdaptiveExampleDescription,
            sourceUrl = AdaptiveExampleSourceUrl,
            isExpressive = false,
        ) {
            ListDetailPaneScaffoldSampleWithExtraPane()
        },
        Example(
            name = "NavigableListDetailPaneScaffoldSample",
            description = AdaptiveExampleDescription,
            sourceUrl = AdaptiveExampleSourceUrl,
            isExpressive = false,
        ) {
            NavigableListDetailPaneScaffoldSample()
        },
    )

private const val BadgeExampleDescription = "Badge examples"
private const val BadgeExampleSourceUrl = "$SampleSourceUrl/BadgeSamples.kt"
val BadgeExamples =
    listOf(
        Example(
            name = "NavigationBarItemWithBadge",
            description = BadgeExampleDescription,
            sourceUrl = BadgeExampleSourceUrl,
            isExpressive = false,
        ) {
            NavigationBarItemWithBadge()
        }
    )

private const val BottomSheetExampleDescription = "Bottom Sheet examples"
private const val BottomSheetExampleSourceUrl = "$SampleSourceUrl/BottomSheetSamples.kt"
val BottomSheetExamples =
    listOf(
        Example(
            name = "ModalBottomSheetSample",
            description = BottomSheetExampleDescription,
            sourceUrl = BottomSheetExampleSourceUrl,
            isExpressive = false,
        ) {
            ModalBottomSheetSample()
        },
        Example(
            name = "SimpleBottomSheetScaffoldSample",
            description = BottomSheetExampleDescription,
            sourceUrl = BottomSheetExampleSourceUrl,
            isExpressive = false,
        ) {
            SimpleBottomSheetScaffoldSample()
        },
        Example(
            name = "BottomSheetScaffoldNestedScrollSample",
            description = BottomSheetExampleDescription,
            sourceUrl = BottomSheetExampleSourceUrl,
            isExpressive = false,
        ) {
            BottomSheetScaffoldNestedScrollSample()
        },
    )

private const val ButtonsExampleDescription = "Button examples"
private const val ButtonsExampleSourceUrl = "$SampleSourceUrl/ButtonSamples.kt"
val ButtonsExamples =
    listOf(
        Example(
            name = "ButtonSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            ButtonSample()
        },
        Example(
            name = "ButtonWithAnimatedShapeSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            ButtonWithAnimatedShapeSample()
        },
        Example(
            name = "SquareButtonSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            SquareButtonSample()
        },
        Example(
            name = "SmallButtonSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            SmallButtonSample()
        },
        Example(
            name = "ElevatedButtonSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            ElevatedButtonSample()
        },
        Example(
            name = "ElevatedButtonWithAnimatedShapeSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            ElevatedButtonWithAnimatedShapeSample()
        },
        Example(
            name = "FilledTonalButtonSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            FilledTonalButtonSample()
        },
        Example(
            name = "FilledTonalButtonWithAnimatedShapeSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            FilledTonalButtonWithAnimatedShapeSample()
        },
        Example(
            name = "OutlinedButtonSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            OutlinedButtonSample()
        },
        Example(
            name = "OutlinedButtonWithAnimatedShapeSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            OutlinedButtonWithAnimatedShapeSample()
        },
        Example(
            name = "TextButtonSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            TextButtonSample()
        },
        Example(
            name = "TextButtonWithAnimatedShapeSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            TextButtonWithAnimatedShapeSample()
        },
        Example(
            name = "ButtonWithIconSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            ButtonWithIconSample()
        },
        Example(
            name = "XSmallButtonWithIconSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            XSmallButtonWithIconSample()
        },
        Example(
            name = "MediumButtonWithIconSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumButtonWithIconSample()
        },
        Example(
            name = "LargeButtonWithIconSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            LargeButtonWithIconSample()
        },
        Example(
            name = "XLargeButtonWithIconSample",
            description = ButtonsExampleDescription,
            sourceUrl = ButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            XLargeButtonWithIconSample()
        },
    )

private const val ButtonGroupsExampleDescription = "ButtonGroup examples"
private const val ButtonGroupsExampleSourceUrl = "$SampleSourceUrl/ButtonGroupSamples.kt"
val ButtonGroupsExamples =
    listOf(
        Example(
            name = "ButtonGroupSample",
            description = ButtonGroupsExampleDescription,
            sourceUrl = ButtonGroupsExampleSourceUrl,
            isExpressive = true,
        ) {
            ButtonGroupSample()
        },
        Example(
            name = "SingleSelectConnectedButtonGroupSample",
            description = ButtonGroupsExampleDescription,
            sourceUrl = ButtonGroupsExampleSourceUrl,
            isExpressive = true,
        ) {
            SingleSelectConnectedButtonGroupSample()
        },
        Example(
            name = "SingleSelectConnectedButtonGroupWithFlowLayoutSample",
            description = ButtonGroupsExampleDescription,
            sourceUrl = ButtonGroupsExampleSourceUrl,
            isExpressive = true,
        ) {
            SingleSelectConnectedButtonGroupWithFlowLayoutSample()
        },
        Example(
            name = "MultiSelectConnectedButtonGroupSample",
            description = ButtonGroupsExampleDescription,
            sourceUrl = ButtonGroupsExampleSourceUrl,
            isExpressive = true,
        ) {
            MultiSelectConnectedButtonGroupSample()
        },
    )

private const val CardsExampleDescription = "Cards examples"
private const val CardsExampleSourceUrl = "$SampleSourceUrl/CardSamples.kt"
val CardExamples =
    listOf(
        Example(
            name = "CardSample",
            description = CardsExampleDescription,
            sourceUrl = CardsExampleSourceUrl,
            isExpressive = false,
        ) {
            CardSample()
        },
        Example(
            name = "ClickableCardSample",
            description = CardsExampleDescription,
            sourceUrl = CardsExampleSourceUrl,
            isExpressive = false,
        ) {
            ClickableCardSample()
        },
        Example(
            name = "ElevatedCardSample",
            description = CardsExampleDescription,
            sourceUrl = CardsExampleSourceUrl,
            isExpressive = false,
        ) {
            ElevatedCardSample()
        },
        Example(
            name = "ClickableElevatedCardSample",
            description = CardsExampleDescription,
            sourceUrl = CardsExampleSourceUrl,
            isExpressive = false,
        ) {
            ClickableElevatedCardSample()
        },
        Example(
            name = "OutlinedCardSample",
            description = CardsExampleDescription,
            sourceUrl = CardsExampleSourceUrl,
            isExpressive = false,
        ) {
            OutlinedCardSample()
        },
        Example(
            name = "ClickableOutlinedCardSample",
            description = CardsExampleDescription,
            sourceUrl = CardsExampleSourceUrl,
            isExpressive = false,
        ) {
            ClickableOutlinedCardSample()
        },
    )

private const val CarouselExampleDescription = "Carousel examples"
private const val CarouselExampleSourceUrl = "$SampleSourceUrl/CarouselSamples.kt"
val CarouselExamples =
    listOf(
        Example(
            name = "HorizontalMultiBrowseCarouselSample",
            description = CarouselExampleDescription,
            sourceUrl = CarouselExampleSourceUrl,
            isExpressive = false,
        ) {
            HorizontalMultiBrowseCarouselSample()
        },
        Example(
            name = "HorizontalUncontainedCarouselSample",
            description = CarouselExampleDescription,
            sourceUrl = CarouselExampleSourceUrl,
            isExpressive = false,
        ) {
            HorizontalUncontainedCarouselSample()
        },
        Example(
            name = "FadingHorizontalMultiBrowseCarouselSample",
            description = CarouselExampleDescription,
            sourceUrl = CarouselExampleSourceUrl,
            isExpressive = false,
        ) {
            FadingHorizontalMultiBrowseCarouselSample()
        },
    )

private const val CheckboxesExampleDescription = "Checkboxes examples"
private const val CheckboxesExampleSourceUrl = "$SampleSourceUrl/CheckboxSamples.kt"
val CheckboxesExamples =
    listOf(
        Example(
            name = "CheckboxSample",
            description = CheckboxesExampleDescription,
            sourceUrl = CheckboxesExampleSourceUrl,
            isExpressive = false,
        ) {
            CheckboxSample()
        },
        Example(
            name = "CheckboxWithTextSample",
            description = CheckboxesExampleDescription,
            sourceUrl = CheckboxesExampleSourceUrl,
            isExpressive = false,
        ) {
            CheckboxWithTextSample()
        },
        Example(
            name = "CheckboxRoundedStrokesSample",
            description = CheckboxesExampleDescription,
            sourceUrl = CheckboxesExampleSourceUrl,
            isExpressive = false,
        ) {
            CheckboxRoundedStrokesSample()
        },
        Example(
            name = "TriStateCheckboxSample",
            description = CheckboxesExampleDescription,
            sourceUrl = CheckboxesExampleSourceUrl,
            isExpressive = false,
        ) {
            TriStateCheckboxSample()
        },
        Example(
            name = "TriStateCheckboxRoundedStrokesSample",
            description = CheckboxesExampleDescription,
            sourceUrl = CheckboxesExampleSourceUrl,
            isExpressive = false,
        ) {
            TriStateCheckboxRoundedStrokesSample()
        },
    )

private const val ChipsExampleDescription = "Chips examples"
private const val ChipsExampleSourceUrl = "$SampleSourceUrl/ChipSamples.kt"
val ChipsExamples =
    listOf(
        Example(
            name = "AssistChipSample",
            description = ChipsExampleDescription,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            AssistChipSample()
        },
        Example(
            name = "ElevatedAssistChipSample",
            description = ChipsExampleDescription,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            ElevatedAssistChipSample()
        },
        Example(
            name = "FilterChipSample",
            description = ChipsExampleDescription,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            FilterChipSample()
        },
        Example(
            name = "ElevatedFilterChipSample",
            description = ChipsExampleDescription,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            ElevatedFilterChipSample()
        },
        Example(
            name = "FilterChipWithLeadingIconSample",
            description = ChipsExampleDescription,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            FilterChipWithLeadingIconSample()
        },
        Example(
            name = "InputChipSample",
            description = ChipsExampleDescription,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            InputChipSample()
        },
        Example(
            name = "InputChipWithAvatarSample",
            description = ChipsExampleDescription,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            InputChipWithAvatarSample()
        },
        Example(
            name = "SuggestionChipSample",
            description = ChipsExampleDescription,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            SuggestionChipSample()
        },
        Example(
            name = "ElevatedSuggestionChipSample",
            description = ChipsExampleDescription,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            ElevatedSuggestionChipSample()
        },
        Example(
            name = "ChipGroupSingleLineSample",
            description = ChipsExampleDescription,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            ChipGroupSingleLineSample()
        },
        Example(
            name = "ChipGroupReflowSample",
            description = ChipsExampleDescription,
            sourceUrl = ChipsExampleSourceUrl,
            isExpressive = false,
        ) {
            ChipGroupReflowSample()
        },
    )

private const val DatePickerExampleDescription = "Date picker examples"
private const val DatePickerExampleSourceUrl = "$SampleSourceUrl/DatePickerSamples.kt"
val DatePickerExamples =
    listOf(
        Example(
            name = "DatePickerSample",
            description = DatePickerExampleDescription,
            sourceUrl = DatePickerExampleSourceUrl,
            isExpressive = false,
        ) {
            DatePickerSample()
        },
        Example(
            name = "DatePickerDialogSample",
            description = DatePickerExampleDescription,
            sourceUrl = DatePickerExampleSourceUrl,
            isExpressive = false,
        ) {
            DatePickerDialogSample()
        },
        Example(
            name = "DatePickerWithDateSelectableDatesSample",
            description = DatePickerExampleDescription,
            sourceUrl = DatePickerExampleSourceUrl,
            isExpressive = false,
        ) {
            DatePickerWithDateSelectableDatesSample()
        },
        Example(
            name = "DateInputSample",
            description = DatePickerExampleDescription,
            sourceUrl = DatePickerExampleSourceUrl,
            isExpressive = false,
        ) {
            DateInputSample()
        },
        Example(
            name = "DateRangePickerSample",
            description = DatePickerExampleDescription,
            sourceUrl = DatePickerExampleSourceUrl,
            isExpressive = false,
        ) {
            DateRangePickerSample()
        },
    )

private const val DialogExampleDescription = "Dialog examples"
private const val DialogExampleSourceUrl = "$SampleSourceUrl/AlertDialogSamples.kt"
val DialogExamples =
    listOf(
        Example(
            name = "AlertDialogSample",
            description = DialogExampleDescription,
            sourceUrl = DialogExampleSourceUrl,
            isExpressive = false,
        ) {
            AlertDialogSample()
        },
        Example(
            name = "AlertDialogWithIconSample",
            description = DialogExampleDescription,
            sourceUrl = DialogExampleSourceUrl,
            isExpressive = false,
        ) {
            AlertDialogWithIconSample()
        },
        Example(
            name = "BasicAlertDialogSample",
            description = DialogExampleDescription,
            sourceUrl = DialogExampleSourceUrl,
            isExpressive = false,
        ) {
            BasicAlertDialogSample()
        },
    )

private const val BottomAppBarsExampleDescription = "Bottom app bar examples"
private const val BottomAppBarsExampleSourceUrl = "$SampleSourceUrl/AppBarSamples.kt"
val BottomAppBarsExamples =
    listOf(
        Example(
            name = "SimpleBottomAppBar",
            description = BottomAppBarsExampleDescription,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = false,
        ) {
            SimpleBottomAppBar()
        },
        Example(
            name = "BottomAppBarWithFAB",
            description = BottomAppBarsExampleDescription,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = false,
        ) {
            BottomAppBarWithFAB()
        },
        Example(
            name = "BottomAppBarWithOverflow",
            description = BottomAppBarsExampleDescription,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = true,
        ) {
            BottomAppBarWithOverflow()
        },
        Example(
            name = "ExitAlwaysBottomAppBar",
            description = BottomAppBarsExampleDescription,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = false,
        ) {
            ExitAlwaysBottomAppBar()
        },
        Example(
            name = "ExitAlwaysBottomAppBarSpacedAround",
            description = BottomAppBarsExampleDescription,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExitAlwaysBottomAppBarSpacedAround()
        },
        Example(
            name = "ExitAlwaysBottomAppBarSpacedBetween",
            description = BottomAppBarsExampleDescription,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExitAlwaysBottomAppBarSpacedBetween()
        },
        Example(
            name = "ExitAlwaysBottomAppBarSpacedEvenly",
            description = BottomAppBarsExampleDescription,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExitAlwaysBottomAppBarSpacedEvenly()
        },
        Example(
            name = "ExitAlwaysBottomAppBarFixed",
            description = BottomAppBarsExampleDescription,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExitAlwaysBottomAppBarFixed()
        },
        Example(
            name = "ExitAlwaysBottomAppBarFixedVibrant",
            description = BottomAppBarsExampleDescription,
            sourceUrl = BottomAppBarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExitAlwaysBottomAppBarFixedVibrant()
        },
    )

private const val TopAppBarExampleDescription = "Top app bar examples"
private const val TopAppBarExampleSourceUrl = "$SampleSourceUrl/AppBarSamples.kt"
val TopAppBarExamples =
    listOf(
        Example(
            name = "SimpleTopAppBar",
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            SimpleTopAppBar()
        },
        Example(
            name = "SimpleTopAppBarWithAdaptiveActions",
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleDescription,
            isExpressive = false,
        ) {
            SimpleTopAppBarWithAdaptiveActions()
        },
        Example(
            name = "SimpleTopAppBarWithSubtitle",
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = true,
        ) {
            SimpleTopAppBarWithSubtitle()
        },
        Example(
            name = "SimpleCenterAlignedTopAppBar",
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            SimpleCenterAlignedTopAppBar()
        },
        Example(
            name = "SimpleCenterAlignedTopAppBarWithSubtitle",
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = true,
        ) {
            SimpleCenterAlignedTopAppBarWithSubtitle()
        },
        Example(
            name = "PinnedTopAppBar",
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            PinnedTopAppBar()
        },
        Example(
            name = "EnterAlwaysTopAppBar",
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = true,
        ) {
            EnterAlwaysTopAppBar()
        },
        Example(
            name = "ExitUntilCollapsedMediumTopAppBar",
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            ExitUntilCollapsedMediumTopAppBar()
        },
        Example(
            name = "ExitUntilCollapsedCenterAlignedMediumFlexibleTopAppBar with subtitle",
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            ExitUntilCollapsedCenterAlignedMediumFlexibleTopAppBar()
        },
        Example(
            name = "ExitUntilCollapsedLargeTopAppBar",
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = false,
        ) {
            ExitUntilCollapsedLargeTopAppBar()
        },
        Example(
            name = "ExitUntilCollapsedCenterAlignedLargeFlexibleTopAppBar with subtitle",
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = true,
        ) {
            ExitUntilCollapsedCenterAlignedLargeFlexibleTopAppBar()
        },
        Example(
            name = "CustomTwoRowsTopAppBar",
            description = TopAppBarExampleDescription,
            sourceUrl = TopAppBarExampleSourceUrl,
            isExpressive = true,
        ) {
            CustomTwoRowsTopAppBar()
        },
    )

private const val FloatingToolbarsExampleDescription = "Floating toolbar examples"
private const val FloatingToolbarsExampleSourceUrl = "$SampleSourceUrl/FloatingToolbarSamples.kt"

val FloatingToolbarsExamples =
    listOf(
        Example(
            name = "ExpandableHorizontalFloatingToolbarSample",
            description = FloatingToolbarsExampleDescription,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExpandableHorizontalFloatingToolbarSample()
        },
        Example(
            name = "OverflowingHorizontalFloatingToolbarSample",
            description = FloatingToolbarsExampleDescription,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            OverflowingHorizontalFloatingToolbarSample()
        },
        Example(
            name = "ScrollableHorizontalFloatingToolbarSample",
            description = FloatingToolbarsExampleDescription,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ScrollableHorizontalFloatingToolbarSample()
        },
        Example(
            name = "ExpandableVerticalFloatingToolbarSample",
            description = FloatingToolbarsExampleDescription,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ExpandableVerticalFloatingToolbarSample()
        },
        Example(
            name = "OverflowingVerticalFloatingToolbarSample",
            description = FloatingToolbarsExampleDescription,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            OverflowingVerticalFloatingToolbarSample()
        },
        Example(
            name = "ScrollableVerticalFloatingToolbarSample",
            description = FloatingToolbarsExampleDescription,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            ScrollableVerticalFloatingToolbarSample()
        },
        Example(
            name = "HorizontalFloatingToolbarWithFabSample",
            description = FloatingToolbarsExampleDescription,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            HorizontalFloatingToolbarWithFabSample()
        },
        Example(
            name = "CenteredHorizontalFloatingToolbarWithFabSample",
            description = FloatingToolbarsExampleDescription,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            CenteredHorizontalFloatingToolbarWithFabSample()
        },
        Example(
            name = "HorizontalFloatingToolbarAsScaffoldFabSample",
            description = FloatingToolbarsExampleDescription,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            HorizontalFloatingToolbarAsScaffoldFabSample()
        },
        Example(
            name = "VerticalFloatingToolbarWithFabSample",
            description = FloatingToolbarsExampleDescription,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            VerticalFloatingToolbarWithFabSample()
        },
        Example(
            name = "CenteredVerticalFloatingToolbarWithFabSample",
            description = FloatingToolbarsExampleDescription,
            sourceUrl = FloatingToolbarsExampleSourceUrl,
            isExpressive = true,
        ) {
            CenteredVerticalFloatingToolbarWithFabSample()
        },
    )

private const val ExtendedFABExampleDescription = "Extended FAB examples"
private const val ExtendedFABExampleSourceUrl = "$SampleSourceUrl/FloatingActionButtonSamples.kt"
val ExtendedFABExamples =
    listOf(
        Example(
            name = "ExtendedFloatingActionButtonSample",
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = false,
        ) {
            ExtendedFloatingActionButtonSample()
        },
        Example(
            name = "SmallExtendedFloatingActionButtonSample",
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            SmallExtendedFloatingActionButtonSample()
        },
        Example(
            name = "MediumExtendedFloatingActionButtonSample",
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumExtendedFloatingActionButtonSample()
        },
        Example(
            name = "LargeExtendedFloatingActionButtonSample",
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            LargeExtendedFloatingActionButtonSample()
        },
        Example(
            name = "ExtendedFloatingActionButtonTextSample",
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = false,
        ) {
            ExtendedFloatingActionButtonTextSample()
        },
        Example(
            name = "SmallExtendedFloatingActionButtonTextSample",
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            SmallExtendedFloatingActionButtonTextSample()
        },
        Example(
            name = "MediumExtendedFloatingActionButtonTextSample",
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumExtendedFloatingActionButtonTextSample()
        },
        Example(
            name = "LargeExtendedFloatingActionButtonTextSample",
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            LargeExtendedFloatingActionButtonTextSample()
        },
        Example(
            name = "AnimatedExtendedFloatingActionButtonSample",
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = false,
        ) {
            AnimatedExtendedFloatingActionButtonSample()
        },
        Example(
            name = "SmallAnimatedExtendedFloatingActionButtonSample",
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            SmallAnimatedExtendedFloatingActionButtonSample()
        },
        Example(
            name = "MediumAnimatedExtendedFloatingActionButtonSample",
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumAnimatedExtendedFloatingActionButtonSample()
        },
        Example(
            name = "LargeAnimatedExtendedFloatingActionButtonSample",
            description = ExtendedFABExampleDescription,
            sourceUrl = ExtendedFABExampleSourceUrl,
            isExpressive = true,
        ) {
            LargeAnimatedExtendedFloatingActionButtonSample()
        },
    )

private const val FloatingActionButtonsExampleDescription = "Floating action button examples"
private const val FloatingActionButtonsExampleSourceUrl =
    "$SampleSourceUrl/FloatingActionButtonSamples.kt"
val FloatingActionButtonsExamples =
    listOf(
        Example(
            name = "FloatingActionButtonSample",
            description = FloatingActionButtonsExampleDescription,
            sourceUrl = FloatingActionButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            FloatingActionButtonSample()
        },
        Example(
            name = "LargeFloatingActionButtonSample",
            description = FloatingActionButtonsExampleDescription,
            sourceUrl = FloatingActionButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            LargeFloatingActionButtonSample()
        },
        Example(
            name = "AnimatedFloatingActionButtonSample",
            description = FloatingActionButtonsExampleDescription,
            sourceUrl = FloatingActionButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            AnimatedFloatingActionButtonSample()
        },
        Example(
            name = "MediumFloatingActionButtonSample",
            description = FloatingActionButtonsExampleDescription,
            sourceUrl = FloatingActionButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumFloatingActionButtonSample()
        },
        Example(
            name = "SmallFloatingActionButtonSample",
            description = FloatingActionButtonsExampleDescription,
            sourceUrl = FloatingActionButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            SmallFloatingActionButtonSample()
        },
    )

private const val FloatingActionButtonMenuExampleDescription = "FAB Menu examples"
private const val FloatingActionButtonMenuExampleSourceUrl =
    "$SampleSourceUrl/FloatingActionButtonMenuSamples.kt"
val FloatingActionButtonMenuExamples =
    listOf(
        Example(
            name = "FloatingActionButtonMenuSample",
            description = FloatingActionButtonMenuExampleDescription,
            sourceUrl = FloatingActionButtonMenuExampleSourceUrl,
            isExpressive = true,
        ) {
            FloatingActionButtonMenuSample()
        }
    )

private const val ListsExampleDescription = "List examples"
private const val ListsExampleSourceUrl = "$SampleSourceUrl/ListSamples.kt"
val ListsExamples =
    listOf(
        Example(
            name = "OneLineListItem",
            description = ListsExampleDescription,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = false,
        ) {
            OneLineListItem()
        },
        Example(
            name = "TwoLineListItem",
            description = ListsExampleDescription,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = false,
        ) {
            TwoLineListItem()
        },
        Example(
            name = "ThreeLineListItemWithOverlineAndSupporting",
            description = ListsExampleDescription,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = false,
        ) {
            ThreeLineListItemWithOverlineAndSupporting()
        },
        Example(
            name = "ThreeLineListItemWithExtendedSupporting",
            description = ListsExampleDescription,
            sourceUrl = ListsExampleSourceUrl,
            isExpressive = false,
        ) {
            ThreeLineListItemWithExtendedSupporting()
        },
    )

private const val IconButtonExampleDescription = "Icon button examples"
private const val IconButtonExampleSourceUrl = "$SampleSourceUrl/IconButtonSamples.kt"
val IconButtonExamples =
    listOf(
        Example(
            name = "IconButtonSample",
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            IconButtonSample()
        },
        Example(
            name = "TintedIconButtonSample",
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            TintedIconButtonSample()
        },
        Example(
            name = "IconToggleButtonSample",
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            IconToggleButtonSample()
        },
        Example(
            name = "FilledIconButtonSample",
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            FilledIconButtonSample()
        },
        Example(
            name = "FilledIconToggleButtonSample",
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            FilledIconToggleButtonSample()
        },
        Example(
            name = "FilledTonalIconButtonSample",
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            FilledTonalIconButtonSample()
        },
        Example(
            name = "FilledTonalIconToggleButtonSample",
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            FilledTonalIconToggleButtonSample()
        },
        Example(
            name = "OutlinedIconButtonSample",
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            OutlinedIconButtonSample()
        },
        Example(
            name = "OutlinedIconToggleButtonSample",
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = false,
        ) {
            OutlinedIconToggleButtonSample()
        },
        Example(
            name = "XSmallNarrowSquareIconButtonsSample",
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = true,
        ) {
            ExtraSmallNarrowSquareIconButtonsSample()
        },
        Example(
            name = "MediumRoundWideIconButtonSample",
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumRoundWideIconButtonSample()
        },
        Example(
            name = "LargeRoundUniformOutlinedIconButtonSample",
            description = IconButtonExampleDescription,
            sourceUrl = IconButtonExampleSourceUrl,
            isExpressive = true,
        ) {
            LargeRoundUniformOutlinedIconButtonSample()
        },
    )

private const val LoadingIndicatorsExampleDescription = "Loading indicators examples"
private const val LoadingIndicatorsExampleSourceUrl =
    "$SampleSourceUrl/" + "LoadingIndicatorSamples.kt"
val LoadingIndicatorsExamples =
    listOf(
        Example(
            name = "LoadingIndicatorSample",
            description = LoadingIndicatorsExampleDescription,
            sourceUrl = LoadingIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            LoadingIndicatorSample()
        },
        Example(
            name = "ContainedLoadingIndicatorSample",
            description = LoadingIndicatorsExampleDescription,
            sourceUrl = LoadingIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            ContainedLoadingIndicatorSample()
        },
        Example(
            name = "DeterminateLoadingIndicatorSample",
            description = LoadingIndicatorsExampleDescription,
            sourceUrl = LoadingIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            DeterminateLoadingIndicatorSample()
        },
        Example(
            name = "DeterminateContainedLoadingIndicatorSample",
            description = LoadingIndicatorsExampleDescription,
            sourceUrl = LoadingIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            DeterminateContainedLoadingIndicatorSample()
        },
        Example(
            name = "LoadingIndicatorPullToRefreshSample",
            description = LoadingIndicatorsExampleDescription,
            sourceUrl = LoadingIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            LoadingIndicatorPullToRefreshSample()
        },
    )

private const val MenusExampleDescription = "Menus examples"
private const val MenusExampleSourceUrl = "$SampleSourceUrl/MenuSamples.kt"
val MenusExamples =
    listOf(
        Example(
            name = "MenuSample",
            description = MenusExampleDescription,
            sourceUrl = MenusExampleSourceUrl,
            isExpressive = false,
        ) {
            MenuSample()
        },
        Example(
            name = "MenuWithScrollStateSample",
            description = MenusExampleDescription,
            sourceUrl = MenusExampleSourceUrl,
            isExpressive = false,
        ) {
            MenuWithScrollStateSample()
        },
        Example(
            name = "ExposedDropdownMenuSample",
            description = MenusExampleDescription,
            sourceUrl = MenusExampleSourceUrl,
            isExpressive = false,
        ) {
            ExposedDropdownMenuSample()
        },
        Example(
            name = "EditableExposedDropdownMenuSample",
            description = MenusExampleDescription,
            sourceUrl = MenusExampleSourceUrl,
            isExpressive = false,
        ) {
            EditableExposedDropdownMenuSample()
        },
        Example(
            name = "MultiAutocompleteExposedDropdownMenuSample",
            description = MenusExampleDescription,
            sourceUrl = MenusExampleSourceUrl,
            isExpressive = false,
        ) {
            MultiAutocompleteExposedDropdownMenuSample()
        },
    )

private const val NavigationBarExampleDescription = "Navigation bar examples"
private const val NavigationBarExampleSourceUrl = "$SampleSourceUrl/NavigationBarSamples.kt"
val NavigationBarExamples =
    listOf(
        Example(
            name = "ShortNavigationBarSample",
            description = NavigationBarExampleDescription,
            sourceUrl = NavigationBarExampleSourceUrl,
            isExpressive = true,
        ) {
            ShortNavigationBarSample()
        },
        Example(
            name = "ShortNavigationBarWithHorizontalItemsSample",
            description = NavigationBarExampleDescription,
            sourceUrl = NavigationBarExampleSourceUrl,
            isExpressive = true,
        ) {
            ShortNavigationBarWithHorizontalItemsSample()
        },
        Example(
            name = "NavigationBarSample",
            description = NavigationBarExampleDescription,
            sourceUrl = NavigationBarExampleSourceUrl,
            isExpressive = false,
        ) {
            NavigationBarSample()
        },
        Example(
            name = "NavigationBarWithOnlySelectedLabelsSample",
            description = NavigationBarExampleDescription,
            sourceUrl = NavigationBarExampleSourceUrl,
            isExpressive = false,
        ) {
            NavigationBarWithOnlySelectedLabelsSample()
        },
    )

private const val NavigationRailExampleDescription = "Navigation rail examples"
private const val NavigationRailExampleSourceUrl = "$SampleSourceUrl/NavigationRailSamples.kt"
val NavigationRailExamples =
    listOf(
        Example(
            name = "WideNavigationRailResponsiveSample",
            description = NavigationRailExampleDescription,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = true,
        ) {
            WideNavigationRailResponsiveSample()
        },
        Example(
            name = "ModalWideNavigationRailSample",
            description = NavigationRailExampleDescription,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = true,
        ) {
            ModalWideNavigationRailSample()
        },
        Example(
            name = "DismissibleModalWideNavigationRailSample",
            description = NavigationRailExampleDescription,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = true,
        ) {
            DismissibleModalWideNavigationRailSample()
        },
        Example(
            name = "WideNavigationRailCollapsedSample",
            description = NavigationRailExampleDescription,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = true,
        ) {
            WideNavigationRailCollapsedSample()
        },
        Example(
            name = "WideNavigationRailExpandedSample",
            description = NavigationRailExampleDescription,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = true,
        ) {
            WideNavigationRailExpandedSample()
        },
        Example(
            name = "WideNavigationRailArrangementsSample",
            description = NavigationRailExampleDescription,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = true,
        ) {
            WideNavigationRailArrangementsSample()
        },
        Example(
            name = "NavigationRailSample",
            description = NavigationRailExampleDescription,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = false,
        ) {
            NavigationRailSample()
        },
        Example(
            name = "NavigationRailWithOnlySelectedLabelsSample",
            description = NavigationRailExampleDescription,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = false,
        ) {
            NavigationRailWithOnlySelectedLabelsSample()
        },
        Example(
            name = "NavigationRailBottomAlignSample",
            description = NavigationRailExampleDescription,
            sourceUrl = NavigationRailExampleSourceUrl,
            isExpressive = false,
        ) {
            NavigationRailBottomAlignSample()
        },
    )

private const val NavigationDrawerExampleDescription = "Navigation drawer examples"
private const val NavigationDrawerExampleSourceUrl = "$SampleSourceUrl/DrawerSamples.kt"
val NavigationDrawerExamples =
    listOf(
        Example(
            name = "ModalNavigationDrawerSample",
            description = NavigationDrawerExampleDescription,
            sourceUrl = NavigationDrawerExampleSourceUrl,
            isExpressive = false,
        ) {
            ModalNavigationDrawerSample()
        },
        Example(
            name = "PermanentNavigationDrawerSample",
            description = NavigationDrawerExampleDescription,
            sourceUrl = NavigationDrawerExampleSourceUrl,
            isExpressive = false,
        ) {
            PermanentNavigationDrawerSample()
        },
        Example(
            name = "DismissibleNavigationDrawerSample",
            description = NavigationDrawerExampleDescription,
            sourceUrl = NavigationDrawerExampleSourceUrl,
            isExpressive = false,
        ) {
            DismissibleNavigationDrawerSample()
        },
    )

private const val NavigationSuiteScaffoldExampleDescription = "Navigation suite scaffold examples"
private const val NavigationSuiteScaffoldExampleSourceUrl =
    "$AdaptiveNavigationSuiteSampleSourceUrl/NavigationSuiteScaffoldSamples.kt"
val NavigationSuiteScaffoldExamples =
    listOf(
        Example(
            name = "NavigationSuiteScaffoldSample",
            description = NavigationSuiteScaffoldExampleDescription,
            sourceUrl = NavigationSuiteScaffoldExampleSourceUrl,
            isExpressive = true,
        ) {
            NavigationSuiteScaffoldSample()
        },
        Example(
            name = "NavigationSuiteScaffoldCustomConfigSample",
            description = NavigationSuiteScaffoldExampleDescription,
            sourceUrl = NavigationSuiteScaffoldExampleSourceUrl,
            isExpressive = true,
        ) {
            NavigationSuiteScaffoldCustomConfigSample()
        },
    )

private const val ProgressIndicatorsExampleDescription = "Progress indicators examples"
private const val ProgressIndicatorsExampleSourceUrl =
    "$SampleSourceUrl/" + "ProgressIndicatorSamples.kt"
val ProgressIndicatorsExamples =
    listOf(
        Example(
            name = "LinearProgressIndicatorSample",
            description = ProgressIndicatorsExampleDescription,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = false,
        ) {
            LinearProgressIndicatorSample()
        },
        Example(
            name = "LinearWavyProgressIndicatorSample",
            description = ProgressIndicatorsExampleDescription,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            LinearWavyProgressIndicatorSample()
        },
        Example(
            name = "IndeterminateLinearProgressIndicatorSample",
            description = ProgressIndicatorsExampleDescription,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = false,
        ) {
            IndeterminateLinearProgressIndicatorSample()
        },
        Example(
            name = "IndeterminateLinearWavyProgressIndicatorSample",
            description = ProgressIndicatorsExampleDescription,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            IndeterminateLinearWavyProgressIndicatorSample()
        },
        Example(
            name = "CircularProgressIndicatorSample",
            description = ProgressIndicatorsExampleDescription,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = false,
        ) {
            CircularProgressIndicatorSample()
        },
        Example(
            name = "CircularWavyProgressIndicatorSample",
            description = ProgressIndicatorsExampleDescription,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            CircularWavyProgressIndicatorSample()
        },
        Example(
            name = "IndeterminateCircularProgressIndicatorSample",
            description = ProgressIndicatorsExampleDescription,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = false,
        ) {
            IndeterminateCircularProgressIndicatorSample()
        },
        Example(
            name = "IndeterminateCircularWavyProgressIndicatorSample",
            description = ProgressIndicatorsExampleDescription,
            sourceUrl = ProgressIndicatorsExampleSourceUrl,
            isExpressive = true,
        ) {
            IndeterminateCircularWavyProgressIndicatorSample()
        },
    )

private const val PullToRefreshExampleDescription = "Pull-to-refresh examples"
private const val PullToRefreshExampleSourceUrl = "$SampleSourceUrl/PullToRefreshSamples.kt"
val PullToRefreshExamples =
    listOf(
        Example(
            name = "PullToRefreshSample",
            description = PullToRefreshExampleDescription,
            sourceUrl = PullToRefreshExampleSourceUrl,
            isExpressive = false,
        ) {
            PullToRefreshSample()
        },
        Example(
            name = "PullToRefreshWithLoadingIndicatorSample",
            description = PullToRefreshExampleDescription,
            sourceUrl = PullToRefreshExampleSourceUrl,
            isExpressive = true,
        ) {
            PullToRefreshWithLoadingIndicatorSample()
        },
        Example(
            name = "PullToRefreshScalingSample",
            description = PullToRefreshExampleDescription,
            sourceUrl = PullToRefreshExampleSourceUrl,
            isExpressive = false,
        ) {
            PullToRefreshScalingSample()
        },
        Example(
            name = "PullToRefreshSampleCustomState",
            description = PullToRefreshExampleDescription,
            sourceUrl = PullToRefreshExampleSourceUrl,
            isExpressive = false,
        ) {
            PullToRefreshSampleCustomState()
        },
        Example(
            name = "PullToRefreshViewModelSample",
            description = PullToRefreshExampleDescription,
            sourceUrl = PullToRefreshExampleSourceUrl,
            isExpressive = false,
        ) {
            PullToRefreshViewModelSample()
        },
        Example(
            name = "PullToRefreshCustomIndicatorWithDefaultTransform",
            description = PullToRefreshExampleDescription,
            sourceUrl = PullToRefreshExampleSourceUrl,
            isExpressive = false,
        ) {
            PullToRefreshCustomIndicatorWithDefaultTransform()
        },
    )

private const val RadioButtonsExampleDescription = "Radio buttons examples"
private const val RadioButtonsExampleSourceUrl = "$SampleSourceUrl/RadioButtonSamples.kt"
val RadioButtonsExamples =
    listOf(
        Example(
            name = "RadioButtonSample",
            description = RadioButtonsExampleDescription,
            sourceUrl = RadioButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            RadioButtonSample()
        },
        Example(
            name = "RadioGroupSample",
            description = RadioButtonsExampleDescription,
            sourceUrl = RadioButtonsExampleSourceUrl,
            isExpressive = false,
        ) {
            RadioGroupSample()
        },
    )

private const val SearchBarExampleDescription = "Search bar examples"
private const val SearchBarExampleSourceUrl = "$SampleSourceUrl/SearchBarSamples.kt"
val SearchBarExamples =
    listOf(
        Example(
            name = "SimpleSearchBarSample",
            description = SearchBarExampleDescription,
            sourceUrl = SearchBarExampleSourceUrl,
            isExpressive = false,
        ) {
            SimpleSearchBarSample()
        },
        Example(
            name = "FullScreenSearchBarScaffoldSample",
            description = SearchBarExampleDescription,
            sourceUrl = SearchBarExampleSourceUrl,
            isExpressive = false,
        ) {
            FullScreenSearchBarScaffoldSample()
        },
        Example(
            name = "DockedSearchBarScaffoldSample",
            description = SearchBarExampleDescription,
            sourceUrl = SearchBarExampleSourceUrl,
            isExpressive = false,
        ) {
            DockedSearchBarScaffoldSample()
        },
    )

private const val SegmentedButtonExampleDescription = "Segmented Button examples"
private const val SegmentedButtonSourceUrl = "$SampleSourceUrl/SegmentedButtonSamples.kt"
val SegmentedButtonExamples =
    listOf(
        Example(
            name = "SegmentedButtonSingleSelectSample",
            description = SegmentedButtonExampleDescription,
            sourceUrl = SegmentedButtonSourceUrl,
            isExpressive = false,
        ) {
            SegmentedButtonSingleSelectSample()
        },
        Example(
            name = "SegmentedButtonMultiSelectSample",
            description = SegmentedButtonExampleDescription,
            sourceUrl = SegmentedButtonSourceUrl,
            isExpressive = false,
        ) {
            SegmentedButtonMultiSelectSample()
        },
    )

private const val ToggleButtonsExampleDescription = "ToggleButton examples"
private const val ToggleButtonsExampleSourceUrl = "$SampleSourceUrl/ToggleButtonSamples.kt"
val ToggleButtonsExamples =
    listOf(
        Example(
            name = "ToggleButtonSample",
            description = ToggleButtonsExampleDescription,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            ToggleButtonSample()
        },
        Example(
            name = "RoundToggleButtonSample",
            description = ToggleButtonsExampleDescription,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            SquareToggleButtonSample()
        },
        Example(
            name = "ElevatedToggleButtonSample",
            description = ToggleButtonsExampleDescription,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            ElevatedToggleButtonSample()
        },
        Example(
            name = "TonalToggleButtonSample",
            description = ToggleButtonsExampleDescription,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            TonalToggleButtonSample()
        },
        Example(
            name = "OutlinedToggleButtonSample",
            description = ToggleButtonsExampleDescription,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            OutlinedToggleButtonSample()
        },
        Example(
            name = "ToggleButtonWithIconSample",
            description = ToggleButtonsExampleDescription,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            ToggleButtonWithIconSample()
        },
        Example(
            name = "XSmallToggleButtonWithIconSample",
            description = ToggleButtonsExampleDescription,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            XSmallToggleButtonWithIconSample()
        },
        Example(
            name = "MediumToggleButtonWithIconSample",
            description = ToggleButtonsExampleDescription,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            MediumToggleButtonWithIconSample()
        },
        Example(
            name = "LargeToggleButtonWithIconSample",
            description = ToggleButtonsExampleDescription,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            LargeToggleButtonWithIconSample()
        },
        Example(
            name = "XLargeToggleButtonWithIconSample",
            description = ToggleButtonsExampleDescription,
            sourceUrl = ToggleButtonsExampleSourceUrl,
            isExpressive = true,
        ) {
            XLargeToggleButtonWithIconSample()
        },
    )

private const val SlidersExampleDescription = "Sliders examples"
private const val SlidersExampleSourceUrl = "$SampleSourceUrl/SliderSamples.kt"
val SlidersExamples =
    listOf(
        Example(
            name = "SliderSample",
            description = SlidersExampleDescription,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            SliderSample()
        },
        Example(
            name = "StepsSliderSample",
            description = SlidersExampleDescription,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            StepsSliderSample()
        },
        Example(
            name = "SliderWithCustomThumbSample",
            description = SlidersExampleDescription,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            SliderWithCustomThumbSample()
        },
        Example(
            name = "SliderWithCustomTrackAndThumbSample",
            description = SlidersExampleDescription,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            SliderWithCustomTrackAndThumbSample()
        },
        Example(
            name = "SliderWithTrackIconsSample",
            description = SlidersExampleDescription,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = true,
        ) {
            SliderWithTrackIconsSample()
        },
        Example(
            name = "CenteredSliderSample",
            description = SlidersExampleDescription,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = true,
        ) {
            CenteredSliderSample()
        },
        Example(
            name = "VerticalSliderSample",
            description = SlidersExampleDescription,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = true,
        ) {
            VerticalSliderSample()
        },
        Example(
            name = "VerticalCenteredSliderSample",
            description = SlidersExampleDescription,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = true,
        ) {
            VerticalCenteredSliderSample()
        },
        Example(
            name = "RangeSliderSample",
            description = SlidersExampleDescription,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            RangeSliderSample()
        },
        Example(
            name = "StepRangeSliderSample",
            description = SlidersExampleDescription,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            StepRangeSliderSample()
        },
        Example(
            name = "RangeSliderWithCustomComponents",
            description = SlidersExampleDescription,
            sourceUrl = SlidersExampleSourceUrl,
            isExpressive = false,
        ) {
            RangeSliderWithCustomComponents()
        },
    )

private const val SnackbarsExampleDescription = "Snackbars examples"
private const val SnackbarsExampleSourceUrl = "$SampleSourceUrl/ScaffoldSamples.kt"
val SnackbarsExamples =
    listOf(
        Example(
            name = "ScaffoldWithSimpleSnackbar",
            description = SnackbarsExampleDescription,
            sourceUrl = SnackbarsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScaffoldWithSimpleSnackbar()
        },
        Example(
            name = "ScaffoldWithIndefiniteSnackbar",
            description = SnackbarsExampleDescription,
            sourceUrl = SnackbarsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScaffoldWithIndefiniteSnackbar()
        },
        Example(
            name = "ScaffoldWithCustomSnackbar",
            description = SnackbarsExampleDescription,
            sourceUrl = SnackbarsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScaffoldWithCustomSnackbar()
        },
        Example(
            name = "ScaffoldWithCoroutinesSnackbar",
            description = SnackbarsExampleDescription,
            sourceUrl = SnackbarsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScaffoldWithCoroutinesSnackbar()
        },
        Example(
            name = "ScaffoldWithMultilineSnackbar",
            description = SnackbarsExampleDescription,
            sourceUrl = SnackbarsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScaffoldWithMultilineSnackbar()
        },
    )

private const val SplitButtonExampleDescription = "Split Button examples"
private const val SplitButtonSourceUrl = "$SampleSourceUrl/SplitButtonSamples.kt"
val SplitButtonExamples =
    listOf(
        Example(
            name = "FilledSplitButtonSample",
            description = SplitButtonExampleDescription,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            FilledSplitButtonSample()
        },
        Example(
            name = "SplitButtonWithUnCheckableTrailingButtonSample",
            description = SplitButtonExampleDescription,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            SplitButtonWithUnCheckableTrailingButtonSample()
        },
        Example(
            name = "SplitButtonWithDropdownMenuSample",
            description = SplitButtonExampleDescription,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            SplitButtonWithDropdownMenuSample()
        },
        Example(
            name = "TonalSplitButtonSample",
            description = SplitButtonExampleDescription,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            TonalSplitButtonSample()
        },
        Example(
            name = "ElevatedSplitButtonSample",
            description = SplitButtonExampleDescription,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            ElevatedSplitButtonSample()
        },
        Example(
            name = "OutlinedSplitButtonSample",
            description = SplitButtonExampleDescription,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            OutlinedSplitButtonSample()
        },
        Example(
            name = "SplitButtonWithTextSample",
            description = SplitButtonExampleDescription,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            SplitButtonWithTextSample()
        },
        Example(
            name = "SplitButtonWithIconSample",
            description = SplitButtonExampleDescription,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            SplitButtonWithIconSample()
        },
        Example(
            name = "XSmallFilledSplitButtonSample",
            description = SplitButtonExampleDescription,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            XSmallFilledSplitButtonSample()
        },
        Example(
            name = "MediumFilledSplitButtonSample",
            description = SplitButtonExampleDescription,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            MediumFilledSplitButtonSample()
        },
        Example(
            name = "LargeFilledSplitButtonSample",
            description = SplitButtonExampleDescription,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            LargeFilledSplitButtonSample()
        },
        Example(
            name = "ExtraLargeFilledSplitButtonSample",
            description = SplitButtonExampleDescription,
            sourceUrl = SplitButtonSourceUrl,
            isExpressive = true,
        ) {
            ExtraLargeFilledSplitButtonSample()
        },
    )

private const val SwitchExampleDescription = "Switch examples"
private const val SwitchExampleSourceUrl = "$SampleSourceUrl/SwitchSamples.kt"
val SwitchExamples =
    listOf(
        Example(
            name = "SwitchSample",
            description = SwitchExampleDescription,
            sourceUrl = SwitchExampleSourceUrl,
            isExpressive = false,
        ) {
            SwitchSample()
        },
        Example(
            name = "SwitchWithThumbIconSample",
            description = SwitchExampleDescription,
            sourceUrl = SwitchExampleSourceUrl,
            isExpressive = false,
        ) {
            SwitchWithThumbIconSample()
        },
    )

private const val TabsExampleDescription = "Tabs examples"
private const val TabsExampleSourceUrl = "$SampleSourceUrl/TabSamples.kt"
val TabsExamples =
    listOf(
        Example(
            name = "PrimaryTextTabs",
            description = TabsExampleDescription,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            PrimaryTextTabs()
        },
        Example(
            name = "PrimaryIconTabs",
            description = TabsExampleDescription,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            PrimaryIconTabs()
        },
        Example(
            name = "SecondaryTextTabs",
            description = TabsExampleDescription,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            SecondaryTextTabs()
        },
        Example(
            name = "SecondaryIconTabs",
            description = TabsExampleDescription,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            SecondaryIconTabs()
        },
        Example(
            name = "TextAndIconTabs",
            description = TabsExampleDescription,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            TextAndIconTabs()
        },
        Example(
            name = "LeadingIconTabs",
            description = TabsExampleDescription,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            LeadingIconTabs()
        },
        Example(
            name = "ScrollingPrimaryTextTabs",
            description = TabsExampleDescription,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScrollingPrimaryTextTabs()
        },
        Example(
            name = "ScrollingSecondaryTextTabs",
            description = TabsExampleDescription,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScrollingSecondaryTextTabs()
        },
        Example(
            name = "FancyTabs",
            description = TabsExampleDescription,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            FancyTabs()
        },
        Example(
            name = "FancyIndicatorTabs",
            description = TabsExampleDescription,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            FancyIndicatorTabs()
        },
        Example(
            name = "FancyIndicatorContainerTabs",
            description = TabsExampleDescription,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            FancyIndicatorContainerTabs()
        },
        Example(
            name = "ScrollingFancyIndicatorContainerTabs",
            description = TabsExampleDescription,
            sourceUrl = TabsExampleSourceUrl,
            isExpressive = false,
        ) {
            ScrollingFancyIndicatorContainerTabs()
        },
    )

private const val TimePickerDescription = "Time Picker examples"
private const val TimePickerSourceUrl = "$SampleSourceUrl/TimePicker.kt"
val TimePickerExamples =
    listOf(
        Example(
            name = "TimePickerSample",
            description = TimePickerDescription,
            sourceUrl = TimePickerSourceUrl,
            isExpressive = false,
        ) {
            TimePickerSample()
        },
        Example(
            name = "TimeInputSample",
            description = TimePickerDescription,
            sourceUrl = TimePickerSourceUrl,
            isExpressive = false,
        ) {
            TimeInputSample()
        },
        Example(
            name = "TimePickerSwitchableSample",
            description = TimePickerDescription,
            sourceUrl = TimePickerSourceUrl,
            isExpressive = false,
        ) {
            TimePickerSwitchableSample()
        },
    )

private const val TextFieldsExampleDescription = "Text fields examples"
private const val TextFieldsExampleSourceUrl = "$SampleSourceUrl/TextFieldSamples.kt"
val TextFieldsExamples =
    listOf(
            Example(
                name = "SimpleTextFieldSample",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                SimpleTextFieldSample()
            },
            Example(
                name = "TextFieldWithInitialValueAndSelection",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithInitialValueAndSelection()
            },
            Example(
                name = "SimpleOutlinedTextFieldSample",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                SimpleOutlinedTextFieldSample()
            },
            Example(
                name = "OutlinedTextFieldWithInitialValueAndSelection",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                OutlinedTextFieldWithInitialValueAndSelection()
            },
            Example(
                name = "TextFieldWithTransformations",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithTransformations()
            },
            Example(
                name = "TextFieldWithIcons",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithIcons()
            },
            Example(
                name = "TextFieldWithPlaceholder",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithPlaceholder()
            },
            Example(
                name = "TextFieldWithPrefixAndSuffix",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithPrefixAndSuffix()
            },
            Example(
                name = "TextFieldWithErrorState",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithErrorState()
            },
            Example(
                name = "TextFieldWithSupportingText",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithSupportingText()
            },
            Example(
                name = "DenseTextFieldContentPadding",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                DenseTextFieldContentPadding()
            },
            Example(
                name = "PasswordTextField",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                PasswordTextField()
            },
            Example(
                name = "TextFieldWithHideKeyboardOnImeAction",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextFieldWithHideKeyboardOnImeAction()
            },
            Example(
                name = "TextArea",
                description = TextFieldsExampleDescription,
                sourceUrl = TextFieldsExampleSourceUrl,
                isExpressive = false,
            ) {
                TextArea()
            },
        )
        .map {
            // By default text field samples are minimal and don't have a `width` modifier to
            // restrict the width. As a result, they grow horizontally if enough text is typed. To
            // prevent this behavior in Catalog app, the code below restricts the width of every
            // text field sample
            it.copy(content = { Box(Modifier.wrapContentWidth().width(280.dp)) { it.content() } })
        }

private const val TooltipsExampleDescription = "Tooltips examples"
private const val TooltipsExampleSourceUrl = "$SampleSourceUrl/TooltipSamples.kt"
val TooltipsExamples =
    listOf(
        Example(
            name = "PlainTooltipSample",
            description = TooltipsExampleDescription,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            PlainTooltipSample()
        },
        Example(
            name = "PlainTooltipWithManualInvocationSample",
            description = TooltipsExampleDescription,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            PlainTooltipWithManualInvocationSample()
        },
        Example(
            name = "PlainTooltipWithCaret",
            description = TooltipsExampleDescription,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            PlainTooltipWithCaret()
        },
        Example(
            name = "PlainTooltipWithCustomCaret",
            description = TooltipsExampleDescription,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            PlainTooltipWithCustomCaret()
        },
        Example(
            name = "RichTooltipSample",
            description = TooltipsExampleDescription,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            RichTooltipSample()
        },
        Example(
            name = "RichTooltipWithManualInvocationSample",
            description = TooltipsExampleDescription,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            RichTooltipWithManualInvocationSample()
        },
        Example(
            name = "RichTooltipWithCaretSample",
            description = TooltipsExampleDescription,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            RichTooltipWithCaretSample()
        },
        Example(
            name = "RichTooltipWithCustomCaretSample",
            description = TooltipsExampleDescription,
            sourceUrl = TooltipsExampleSourceUrl,
            isExpressive = false,
        ) {
            RichTooltipWithCustomCaretSample()
        },
    )

val MaterialShapesExamples =
    listOf(
        Example(
            name = "ShapesSample",
            description = "Material shapes examples",
            sourceUrl = "$SampleSourceUrl/MaterialShapesSamples.kt",
            isExpressive = true,
        ) {
            AllShapes()
        }
    )
