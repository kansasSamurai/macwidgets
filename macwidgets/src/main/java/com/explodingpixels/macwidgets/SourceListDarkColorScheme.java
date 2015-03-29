package com.explodingpixels.macwidgets;

import java.awt.Color;
import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import com.explodingpixels.painter.GradientWithBorderPainter;
import com.explodingpixels.painter.MacWidgetsPainter;

/**
 * A {@link SourceListColorScheme} that provides {@link com.explodingpixels.painter.MacWidgetsPainter}s and colors to render a standard
 * Mac {@link SourceList}:
 * <br>
 * <img src="../../../../graphics/iMovieSourceList.png">
 *
 * @see com.explodingpixels.macwidgets.SourceList#setColorScheme(SourceListColorScheme)
 * @see com.explodingpixels.macwidgets.plaf.SourceListTreeUI#setColorScheme(SourceListColorScheme)
 */
public class SourceListDarkColorScheme implements SourceListColorScheme {

    private static final MacWidgetsPainter<Component> ACTIVE_FOCUSED_SELECTION_PAINTER =
            createSourceListActiveFocusedSelectionPainter();

    private static final MacWidgetsPainter<Component> ACTIVE_UNFOCUSED_SELECTION_PAINTER =
            createSourceListActiveUnfocusedSelectionPainter();

    private static final MacWidgetsPainter<Component> INACTIVE_FOCUSED_SELECTION_PAINTER =
            createSourceListInactiveSelectionPainter();

    private static Color ACTIVE_BACKGROUND_COLOR = new Color(0x3e3e3e);
    private static Color INACTIVE_BACKGROUND_COLOR = new Color(0x4e4e4e);

    private static final Color CATEGORY_FONT_COLOR = Color.WHITE;
    private static final Color CATEGORY_FONT_SHADOW_COLOR = new Color(0, 0, 0, 100);
    private static final Color ITEM_FONT_COLOR = Color.WHITE;
    private static final Color SELECTED_ITEM_FONT_COLOR = CATEGORY_FONT_COLOR;
    private static final Color SELECTED_ITEM_FONT_SHADOW_COLOR = CATEGORY_FONT_SHADOW_COLOR;

    private static final Icon COLLAPSED_ICON = new ImageIcon(
            SourceList.class.getResource(
                    "/com/explodingpixels/macwidgets/images/source_list_white_right_arrow.png"));

    private static final Icon EXPANDED_ICON = new ImageIcon(
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
        return COLLAPSED_ICON;
    }

    @Override
    public Icon getUnselectedExpandedIcon() {
        return EXPANDED_ICON;
    }

    @Override
    public Icon getSelectedCollapsedIcon() {
        return COLLAPSED_ICON;
    }

    @Override
    public Icon getSelectedExpandedIcon() {
        return EXPANDED_ICON;
    }

    @Override
    public Color getBadgeTextColor() {
        return getActiveBackgroundColor();
    }

    @Override
    public Color getSelectedBadgeColor() {
        return Color.WHITE;
    }

    @Override
    public Color getActiveUnselectedBadgeColor() {
        return Color.WHITE;
    }

    @Override
    public Color getInativeUnselectedBadgeColor() {
        return Color.WHITE;
    }

    private static MacWidgetsPainter<Component> createSourceListActiveFocusedSelectionPainter() {
        Color topLineColor = new Color(0x707070);
        Color topColor = new Color(0x949494);
        Color bottomColor = new Color(0x6a6a6a);
        return new GradientWithBorderPainter(topLineColor, bottomColor, topColor, bottomColor);
    }

    private static MacWidgetsPainter<Component> createSourceListActiveUnfocusedSelectionPainter() {
        return createSourceListInactiveSelectionPainter();
    }

    private static MacWidgetsPainter<Component> createSourceListInactiveSelectionPainter() {
        Color topLineColor = new Color(0x979797);
        Color topColor = new Color(0xb4b4b4);
        Color bottomColor = new Color(0x8a8a8a);
        return new GradientWithBorderPainter(topLineColor, bottomColor, topColor, bottomColor);
    }
}
