# Implementation Plan - Product List Mobile Optimization

The user reports that the Product List screen (`activity_product_list.xml`) appears "stretched" and wants it optimized for a mobile phone form factor.

## Proposed Changes

### [Component Name] Layouts

#### [MODIFY] [activity_product_list.xml](file:///Users/senai/AndroidStudioProjects/magalu_gustavo2/app/src/main/res/layout/activity_product_list.xml)
- **Fix Grid Items**: Override the layout parameters in the `<include>` tags to ensure they use `android:layout_width="0dp"` and `android:layout_columnWeight="1"`. This prevents the cards from stretching incorrectly within the `GridLayout`.
- **Add Margins**: Ensure the `productListGrid` has proper padding and margins to match the mobile styling of the Home screen.
- **Consistent Navigation**: Ensure the back button and toolbar styling are identical to other screens for a cohesive mobile feel.

#### [MODIFY] [item_product_card.xml](file:///Users/senai/AndroidStudioProjects/magalu_gustavo2/app/src/main/res/layout/item_product_card.xml)
- Change `android:layout_width="match_parent"` to `android:layout_width="wrap_content"` to prevent it from forcing a full-width stretch when included in grids.

## Verification Plan

### Manual Verification
- Deploy the app and navigate to the Product List screen.
- Verify that the two-column grid looks proportional on a phone screen.
- Ensure cards are not overlapping or excessively wide.
