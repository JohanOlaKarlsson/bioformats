//
// OverlayTool.java
//

/*
VisBio application for visualization of multidimensional
biological image data. Copyright (C) 2002-2004 Curtis Rueden.

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package loci.visbio.overlays;

/** OverlayTool is the superclass of all overlay tools. */
public class OverlayTool {

  // -- Fields --

  /** Associated overlay transform. */
  protected OverlayTransform overlay;

  /** Name of this tool. */
  protected String name;

  /** Tool tip text. */
  protected String tip;

  /** Filename of icon. */
  protected String icon;


  // -- Constructor --

  /** Constructs a measurement line creation tool. */
  public OverlayTool(OverlayTransform overlay,
    String name, String tip, String icon)
  {
    this.overlay = overlay;
    this.name = name;
    this.tip = tip;
    this.icon = icon;
  }


  // -- OverlayTool API methods --

  /** Instructs this tool to respond to a mouse press. */
  public void mouseDown(float x, float y, int[] pos) { }

  /** Instructs this tool to respond to a mouse release. */
  public void mouseUp(float x, float y, int[] pos) { }

  /** Instructs this tool to respond to a mouse drag. */
  public void mouseDrag(float x, float y, int[] pos) { }

  /** Gets associated overlay transform. */
  public OverlayTransform getTransform() { return overlay; }

  /** Gets tool name. */
  public String getName() { return name; }

  /** Gets tool tip text. */
  public String getTip() { return tip; }

  /** Gets path to icon file. */
  public String getIcon() { return icon; }


  // -- Utility methods --

  /** Configures the given overlay to match the current settings. */
  protected void configureOverlay(OverlayObject oo) {
    OverlayWidget panel = (OverlayWidget) overlay.getControls();
    oo.setColor(panel.getActiveColor());
    oo.setGroup(panel.getActiveGroup());
    oo.setDescription(panel.getDescription());
  }

}
