
/*
 * ome.xml.r201004.ChannelProfile
 *
 *-----------------------------------------------------------------------------
 *
 *  Copyright (C) @year@ Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee,
 *      University of Wisconsin-Madison
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *-----------------------------------------------------------------------------
 */

/*-----------------------------------------------------------------------------
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by callan via xsd-fu on 2010-04-20 18:27:32+0100
 *
 *-----------------------------------------------------------------------------
 */

package ome.xml.r201004;

import java.util.ArrayList;
import java.util.List;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ome.xml.r201004.enums.*;

public class ChannelProfile extends AbstractOMEModelObject
{
	// -- Instance variables --

	// Property
	private ProfileSource origin;

	// Property
	private String name;

	// Property
	private String description;

	// Property
	private LightSourceSettings lightSourceSettings;

	// Back reference OTFRef
	private List<OTF> otf = new ArrayList<OTF>();

	// Property
	private DetectorSettings detectorSettings;

	// Back reference FilterSetRef
	private List<FilterSet> filterSet = new ArrayList<FilterSet>();

	// -- Constructors --

	/** Default constructor. */
	public ChannelProfile()
	{
		super();
	}

	/** 
	 * Constructs ChannelProfile recursively from an XML DOM tree.
	 * @param element Root of the XML DOM tree to construct a model object
	 * graph from.
	 * @throws EnumerationException If there is an error instantiating an
	 * enumeration during model object creation.
	 */
	public ChannelProfile(Element element) throws EnumerationException
	{
		super(element);
		String tagName = element.getTagName();
		if (!"ChannelProfile".equals(tagName))
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"Expecting node name of ChannelProfile got %s",
					tagName));
		}
		// Model object: None
		if (element.hasAttribute("origin"))
		{
			// Attribute property which is an enumeration origin
			setorigin(ProfileSource.fromString(
					element.getAttribute("origin")));
		}
		// Model object: None
		NodeList Name_nodeList = element.getElementsByTagName("Name");
		if (Name_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"Name node list size %d != 1",
					Name_nodeList.getLength()));
		}
		else if (Name_nodeList.getLength() != 0)
		{
			// Element property Name which is not complex (has no
			// sub-elements)
			setName(Name_nodeList.item(0).getTextContent());
		}
		// Model object: None
		NodeList Description_nodeList = element.getElementsByTagName("Description");
		if (Description_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"Description node list size %d != 1",
					Description_nodeList.getLength()));
		}
		else if (Description_nodeList.getLength() != 0)
		{
			// Element property Description which is not complex (has no
			// sub-elements)
			setDescription(Description_nodeList.item(0).getTextContent());
		}
		// Model object: None
		NodeList LightSourceSettings_nodeList = element.getElementsByTagName("LightSourceSettings");
		if (LightSourceSettings_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"LightSourceSettings node list size %d != 1",
					LightSourceSettings_nodeList.getLength()));
		}
		else if (LightSourceSettings_nodeList.getLength() != 0)
		{
			// Element property LightSourceSettings which is complex (has
			// sub-elements)
			setLightSourceSettings(new LightSourceSettings(
					(Element) LightSourceSettings_nodeList.item(0)));
		}
		// Model object: None
		// *** IGNORING *** Skipped back reference OTFRef
		// Model object: None
		NodeList DetectorSettings_nodeList = element.getElementsByTagName("DetectorSettings");
		if (DetectorSettings_nodeList.getLength() > 1)
		{
			// TODO: Should be its own Exception
			throw new RuntimeException(String.format(
					"DetectorSettings node list size %d != 1",
					DetectorSettings_nodeList.getLength()));
		}
		else if (DetectorSettings_nodeList.getLength() != 0)
		{
			// Element property DetectorSettings which is complex (has
			// sub-elements)
			setDetectorSettings(new DetectorSettings(
					(Element) DetectorSettings_nodeList.item(0)));
		}
		// Model object: None
		// *** IGNORING *** Skipped back reference FilterSetRef
	}

	// -- ChannelProfile API methods --

	// Property
	public ProfileSource getorigin()
	{
		return origin;
	}

	public void setorigin(ProfileSource origin)
	{
		this.origin = origin;
	}

	// Property
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	// Property
	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	// Property
	public LightSourceSettings getLightSourceSettings()
	{
		return lightSourceSettings;
	}

	public void setLightSourceSettings(LightSourceSettings lightSourceSettings)
	{
		this.lightSourceSettings = lightSourceSettings;
	}

	// Reference OTFRef
	public int sizeOfLinkedOTFList()
	{
		return otf.size();
	}

	public List<OTF> copyLinkedOTFList()
	{
		return new ArrayList<OTF>(otf);
	}

	public OTF getLinkedOTF(int index)
	{
		return otf.get(index);
	}

	public OTF setLinkedOTF(int index, OTF o)
	{
		return otf.set(index, o);
	}

	public void linkOTF(OTF o)
	{
		this.otf.add(o);
	}

	public void unlinkOTF(OTF o)
	{
		this.otf.add(o);
	}

	// Property
	public DetectorSettings getDetectorSettings()
	{
		return detectorSettings;
	}

	public void setDetectorSettings(DetectorSettings detectorSettings)
	{
		this.detectorSettings = detectorSettings;
	}

	// Reference FilterSetRef
	public int sizeOfLinkedFilterSetList()
	{
		return filterSet.size();
	}

	public List<FilterSet> copyLinkedFilterSetList()
	{
		return new ArrayList<FilterSet>(filterSet);
	}

	public FilterSet getLinkedFilterSet(int index)
	{
		return filterSet.get(index);
	}

	public FilterSet setLinkedFilterSet(int index, FilterSet o)
	{
		return filterSet.set(index, o);
	}

	public void linkFilterSet(FilterSet o)
	{
		this.filterSet.add(o);
	}

	public void unlinkFilterSet(FilterSet o)
	{
		this.filterSet.add(o);
	}

	public Element asXMLElement(Document document)
	{
		// Creating XML block for ChannelProfile
		Element ChannelProfile_element = document.createElement("ChannelProfile");
		if (origin != null)
		{
			// Attribute property origin
			ChannelProfile_element.setAttribute("origin", origin.toString());
		}
		if (name != null)
		{
			// Element property Name which is not complex (has no
			// sub-elements)
			Element name_element = document.createElement("Name");
			name_element.setTextContent(name);
			ChannelProfile_element.appendChild(name_element);
		}
		if (description != null)
		{
			// Element property Description which is not complex (has no
			// sub-elements)
			Element description_element = document.createElement("Description");
			description_element.setTextContent(description);
			ChannelProfile_element.appendChild(description_element);
		}
		if (lightSourceSettings != null)
		{
			// Element property LightSourceSettings which is complex (has
			// sub-elements)
			ChannelProfile_element.appendChild(lightSourceSettings.asXMLElement(document));
		}
		if (otf != null)
		{
			// *** IGNORING *** Skipped back reference OTFRef
		}
		if (detectorSettings != null)
		{
			// Element property DetectorSettings which is complex (has
			// sub-elements)
			ChannelProfile_element.appendChild(detectorSettings.asXMLElement(document));
		}
		if (filterSet != null)
		{
			// *** IGNORING *** Skipped back reference FilterSetRef
		}
		return ChannelProfile_element;
	}
}
