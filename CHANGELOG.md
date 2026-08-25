# Changelog

## 1.5.0-alpha26

| Library | Before | After |
|---|---|---|
| Compose Material3 | 1.5.0-alpha16 | **1.5.0-alpha26** |
| Compose UI | 1.11.0-beta02 | **1.13.0-alpha01** |
| Compose BOM (alpha) | 2026.03.01 | **2026.08.00** |
| Material3 Adaptive | 1.3.0-alpha09 | **1.3.0** (stable 🎉) |

### New components

- **Typography** — type scale showcase, including a custom font family sample.
- **Ripple** *(Unofficial)* — 5 samples: default ripple, dynamic color, opacity configuration, and the new inset focus ring indication.
- **Scrollbar** *(Unofficial)* — non-interactive scrollbars on `LazyColumn` and vertical scroll.
- **Surface** *(Unofficial)* — plain, clickable, selectable, and toggleable surfaces.

*(Unofficial = AndroidX ships these samples but doesn't list them in its own catalog.)*

### New examples

- **Text Fields**: the whole Expressive text field family — 14 samples (filled + outlined: basic, icons, placeholder, error state, password, prefix/suffix, supporting text).
- **Lists**: new `SegmentedListItems` and `StandardListItems` expressive samples; previous list items renamed to `Legacy*`.
- **Chips**: corner-morphing selection animation for Filter, Elevated Filter, and Input chips.
- **Top App Bars**: reworked flexible app bar set — exit-until-collapsed medium/large, and subtitle + center-aligned variants.
- **Button Groups**: `ButtonGroupWithCustomItemSample`; connected single/multi-select samples reworked.
- **Toggle Buttons**: outlined icon toggle with animated shape; `TonalToggleButton` renamed to `FilledTonalToggleButton`.

### Theme picker

- New **Focus indication style** setting: default opacity vs. the new **inset focus ring** (pairs with the Ripple samples).

### Build & tooling

- AGP **9.3.2** (built-in Kotlin — the standalone Kotlin Android plugin is gone), Gradle **9.6.1**, compileSdk **37**. JDK 21 still required.
- Removed unused `runtime-rxjava2/3` dependencies (rxjava3 1.13.0-alpha01 ships a broken duplicate namespace).

### Held back — waiting for the next published alphas

These compile in neither the upstream tip version (APIs unpublished) nor the previous version (old APIs removed from 1.5.0-alpha26):

- **Sliders**: vertical and vertical-centered sliders, `RangeSliderWithCustomComponents`, `LegacyRangeSliderSample`.
- **Menus**: `GroupedMenuSample`, cascading submenus, and the selectable/checkable dropdown menu items.
- **Toggle Buttons**: `ToggleButtonWithButtonSizeSample`.
- **Time Pickers**: new Vibrant and Uncontained variants (new-only, no previous version).
- **Scroll Field**: entire new component (new-only).
- **Carousel**: upstream's multi-browse rewrite (the existing carousel samples remain available).
