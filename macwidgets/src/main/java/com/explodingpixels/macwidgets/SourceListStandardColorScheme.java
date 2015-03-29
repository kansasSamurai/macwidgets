package com.explodingpixels.macwidgets;

import java.awt.Color;
import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import com.explodingpixels.macwidgets.plaf.EmphasizedLabelUI;
import com.explodingpixels.painter.GradientWithBorderPainter;
import com.explodingpixels.painter.MacWidgetsPainter;

/**
 * A {@link SourceListColorScheme} that provides {@link com.explodingpixels.painter.MacWidgetsPainter}s and colors to render a standard
 * Mac {@link SourceList}:
 * <br>
 * <img src="../../../../graphics/iTunesSourceList.png">
 *
 * @see com.explodingpixels.macwidgets.SourceList#setColorScheme(SourceListColorScheme)
 * @see com.explodingpixels.macwidgets.plaf.SourceListTreeUI#setColorScheme(SourceListColorScheme)
 */
public class SourceListStandardColorScheme implements SourceListColorScheme {

    private static final MacWidgetsPainter<Component> ACTIVE_FOCUSED_SELECTION_PAINTER =
            createSourceListActiveFocusedSelectionPainter();

    private static final MacWidgetsPainter<Component> ACTIVE_UNFOCUSED_SELECTION_PAINTER =
            createSourceListActiveUnfocusedSelectionPainter();

    private static final MacWidgetsPainter<Component> INACTIVE_FOCUSED_SELECTION_PAINTER =
            createSourceListInactiveSelectionPainter();

    private static Color ACTIVE_BACKGROUND_COLOR = new Color(0xd6dde5);
    private static Color INACTIVE_BACKGROUND_COLOR = new Color(0xe8e8e8);

    private static final Color CATEGORY_FONT_COLOR = new Color(0x606e80);
    private static final Color CATEGORY_FONT_SHADOW_COLOR = EmphasizedLabelUI.DEFAULT_EMPHASIS_COLOR;
    private static final Color ITEM_FONT_COLOR = Color.BLACK;
    private static final Color SELECTED_ITEM_FONT_COLOR = Color.WHITE;
    private static final Color SELECTED_ITEM_FONT_SHADOW_COLOR = new Color(0, 0, 0, 110);

    private static Color BADGE_SELECTED_COLOR = Color.WHITE;
    private static Color BADGE_ACTIVE_UNSELECTED_COLOR = new Color(0x8899bc);
    private static Color BADGE_INACTIVE_UNSELECTED_COLOR = new Color(0x9a9a9a);
    private static Color BADGE_TEXT_COLOR = BADGE_SELECTED_COLOR;

    public static final Icon UNSELECTED_COLLAPSED_ICON = new ImageIcon(
            SourceList.class.getResource(
                    "/com/explodingpixels/macwidgets/images/source_list_right_arrow.png"));

    private static final Icon UNSELECTED_EXPANDED_ICON = new ImageIcon(
            SourceList.class.getResource(
                    "/com/explodingpixels/macwidgets/images/source_list_down_arrow.png"));

    private static final Icon SELECTED_COLLAPSED_ICON = new ImageIcon(
            SourceList.class.getResource(
                    "/com/explodingpixels/macwidgets/images/source_list_white_right_arrow.png"));

    private static final Icon SELECTED_EXPANDED_ICON = new ImageIcon(
            SourceList.class.getResource(
                    "/com/explodingpixels/macwidgets/images/source_list_white_down_arrow.png"));

    @Override
    public MacWidgetsPainter<Component> getActiveFocusedSelectedItemPainter() {
        return ACTIVE_FOCUSED_SELECTION_PAINTER;
    }

    @Override
    public MacWidgetsPainter<Component> getActiveUnfocusedSelectedItemPainter() {
        return ACTIVE_UNFOCUSED_SELECTION_PAINTER;
    }

    @Override
    public MacWidgetsPainter<Component> getInactiveSelectedItemPainter() {
        return INACTIVE_FOCUSED_SELECTION_PAINTER;
    }

    @Override
    public Color getCategoryTextColor() {
        return CATEGORY_FONT_COLOR;
    }

    @Override
    public Color getCategoryTextShadowColor() {
        return CATEGORY_FONT_SHADOW_COLOR;
    }

    @Override
    public Color getUnselectedItemTextColor() {
        return ITEM_FONT_COLOR;
    }

    @Override
    public Color getSelectedItemTextColor() {
        return SELECTED_ITEM_FONT_COLOR;
    }

    @Override
    public Color getSelectedItemFontShadowColor() {
        return SELECTED_ITEM_FONT_SHADOW_COLOR;
    }

    @Override
    public Color getActiveBackgroundColor() {
        return ACTIVE_BACKGROUND_COLOR;
    }

    @Override
    public Color getInactiveBackgroundColor() {
        return INACTIVE_BACKGROUND_COLOR;
    }

    @Override
    public Icon getUnselectedCollapsedIcon() {
        return UNSELECTED_COLLAPSED_ICON;
    }

    @Override
    public Icon getUnselectedExpandedIcon() {
        return UNSELECTED_EXPANDED_ICON;
    }

    @Override
    public Icon getSelectedCollapsedIcon() {
        return SELECTED_COLLAPSED_ICON;
    }

    @Override
    public Icon getSelectedExpandedIcon() {
        return SELECTED_EXPANDED_ICON;
    }

    @Override
    public Color getBadgeTextColor() {
        return BADGE_TEXT_COLOR;
    }

    @Override
    public Color getSelectedBadgeColor() {
        return BADGE_SELECTED_COLOR;
    }

    @Override
    public Color getActiveUnselectedBadgeColor() {
        return BADGE_ACTIVE_UNSELECTED_COLOR;
    }

    @Override
    public Color getInativeUnselectedBadgeColor() {
        return BADGE_INACTIVE_UNSELECTED_COLOR;
    }

    private static MacWidgetsPainter<Component> createSourceListActiveFocusedSelectionPainter() {
        Color topLineColor = new Color(0x4580c8);
        Color topColor = new Color(0x5d94d6);
        Color bottomColor = new Color(0x1956ad);
        return new GradientWithBorderPainter(topLineColor, bottomColor, topColor, bottomColor);
    }

    private static MacWidgetsPainter<Component> createSourceListActiveUnfocusedSelectionPainter() {
        Color topLineColor = new Color(0x91a0c0);
        Color topColor = new Color(0xa1b0cf);
        Color bottomColor = new Color(0x7185ab);
        return new GradientWithBorderPainter(topLineColor, bottomColor, topColor, bottomColor);
    }

    private static MacWidgetsPainter<Component> createSourceListInactiveSelectionPainter() {
        Color topLineColor = new Color(0x979797);
        Color topColor = new Color(0xb4b4b4);
        Color bottomColor = new Color(0x8a8a8a);
        return new GradientWithBorderPainter(topLineColor, bottomColor, topColor, bottomColor);
    }
}
