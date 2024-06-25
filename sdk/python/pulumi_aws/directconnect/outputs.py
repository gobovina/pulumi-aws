# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = [
    'GetRouterConfigurationRouterResult',
]

@pulumi.output_type
class GetRouterConfigurationRouterResult(dict):
    def __init__(__self__, *,
                 platform: str,
                 router_type_identifier: str,
                 software: str,
                 vendor: str,
                 xslt_template_name: str,
                 xslt_template_name_for_mac_sec: str):
        """
        :param str platform: Router platform
        :param str router_type_identifier: ID of the Router Type. For example: `CiscoSystemsInc-2900SeriesRouters-IOS124`
               
               There is currently no AWS API to retrieve the full list of `router_type_identifier` values. Here is a list of known `RouterType` objects that can be used:
               
               ```json
               {
               "routerTypes": [
               {"platform":"2900 Series Routers","routerTypeIdentifier":"CiscoSystemsInc-2900SeriesRouters-IOS124","software":"IOS 12.4+","vendor":"Cisco Systems, Inc.","xsltTemplateName":"customer-router-cisco-generic.xslt","xsltTemplateNameForMacSec":""},
               {"platform":"3700 Series Routers","routerTypeIdentifier":"CiscoSystemsInc-3700SeriesRouters-IOS124","software":"IOS 12.4+","vendor":"Cisco Systems, Inc.","xsltTemplateName":"customer-router-cisco-generic.xslt","xsltTemplateNameForMacSec":""},
               {"platform":"7200 Series Routers","routerTypeIdentifier":"CiscoSystemsInc-7200SeriesRouters-IOS124","software":"IOS 12.4+","vendor":"Cisco Systems, Inc.","xsltTemplateName":"customer-router-cisco-generic.xslt","xsltTemplateNameForMacSec":""},
               {"platform":"Nexus 7000 Series Switches","routerTypeIdentifier":"CiscoSystemsInc-Nexus7000SeriesSwitches-NXOS51","software":"NX-OS 5.1+","vendor":"Cisco Systems, Inc.","xsltTemplateName":"customer-switch-cisco-nexus-generic.xslt","xsltTemplateNameForMacSec":""},
               {"platform":"Nexus 9K+ Series Switches","routerTypeIdentifier":"CiscoSystemsInc-Nexus9KSeriesSwitches-NXOS93","software":"NX-OS 9.3+","vendor":"Cisco Systems, Inc.","xsltTemplateName":"customer-switch-cisco-nexus-generic.xslt","xsltTemplateNameForMacSec":"customer-switch-cisco-nexus-generic-macsec.xslt"},
               {"platform":"M/MX Series Routers","routerTypeIdentifier":"JuniperNetworksInc-MMXSeriesRouters-JunOS95","software":"JunOS 9.5+","vendor":"Juniper Networks, Inc.","xsltTemplateName":"customer-router-juniper-generic.xslt","xsltTemplateNameForMacSec":"customer-router-juniper-generic-macsec.xslt"},
               {"platform":"SRX Series Routers","routerTypeIdentifier":"JuniperNetworksInc-SRXSeriesRouters-JunOS95","software":"JunOS 9.5+","vendor":"Juniper Networks, Inc.","xsltTemplateName":"customer-router-juniper-generic.xslt","xsltTemplateNameForMacSec":""},
               {"platform":"T Series Routers","routerTypeIdentifier":"JuniperNetworksInc-TSeriesRouters-JunOS95","software":"JunOS 9.5+","vendor":"Juniper Networks, Inc.","xsltTemplateName":"customer-router-juniper-generic.xslt","xsltTemplateNameForMacSec":""},
               {"platform":"PA-3000+ and 5000+ series","routerTypeIdentifier":"PaloAltoNetworks-PA3000and5000series-PANOS803","software":"PAN-OS 8.0.3+","vendor":"Palo Alto Networks","xsltTemplateName":"customer-router-palo-alto-generic.xslt","xsltTemplateNameForMacSec":""}]
               }
               ```
        :param str software: Router operating system
        :param str vendor: Router vendor
        :param str xslt_template_name: Router XSLT Template Name
        """
        pulumi.set(__self__, "platform", platform)
        pulumi.set(__self__, "router_type_identifier", router_type_identifier)
        pulumi.set(__self__, "software", software)
        pulumi.set(__self__, "vendor", vendor)
        pulumi.set(__self__, "xslt_template_name", xslt_template_name)
        pulumi.set(__self__, "xslt_template_name_for_mac_sec", xslt_template_name_for_mac_sec)

    @property
    @pulumi.getter
    def platform(self) -> str:
        """
        Router platform
        """
        return pulumi.get(self, "platform")

    @property
    @pulumi.getter(name="routerTypeIdentifier")
    def router_type_identifier(self) -> str:
        """
        ID of the Router Type. For example: `CiscoSystemsInc-2900SeriesRouters-IOS124`

        There is currently no AWS API to retrieve the full list of `router_type_identifier` values. Here is a list of known `RouterType` objects that can be used:

        ```json
        {
        "routerTypes": [
        {"platform":"2900 Series Routers","routerTypeIdentifier":"CiscoSystemsInc-2900SeriesRouters-IOS124","software":"IOS 12.4+","vendor":"Cisco Systems, Inc.","xsltTemplateName":"customer-router-cisco-generic.xslt","xsltTemplateNameForMacSec":""},
        {"platform":"3700 Series Routers","routerTypeIdentifier":"CiscoSystemsInc-3700SeriesRouters-IOS124","software":"IOS 12.4+","vendor":"Cisco Systems, Inc.","xsltTemplateName":"customer-router-cisco-generic.xslt","xsltTemplateNameForMacSec":""},
        {"platform":"7200 Series Routers","routerTypeIdentifier":"CiscoSystemsInc-7200SeriesRouters-IOS124","software":"IOS 12.4+","vendor":"Cisco Systems, Inc.","xsltTemplateName":"customer-router-cisco-generic.xslt","xsltTemplateNameForMacSec":""},
        {"platform":"Nexus 7000 Series Switches","routerTypeIdentifier":"CiscoSystemsInc-Nexus7000SeriesSwitches-NXOS51","software":"NX-OS 5.1+","vendor":"Cisco Systems, Inc.","xsltTemplateName":"customer-switch-cisco-nexus-generic.xslt","xsltTemplateNameForMacSec":""},
        {"platform":"Nexus 9K+ Series Switches","routerTypeIdentifier":"CiscoSystemsInc-Nexus9KSeriesSwitches-NXOS93","software":"NX-OS 9.3+","vendor":"Cisco Systems, Inc.","xsltTemplateName":"customer-switch-cisco-nexus-generic.xslt","xsltTemplateNameForMacSec":"customer-switch-cisco-nexus-generic-macsec.xslt"},
        {"platform":"M/MX Series Routers","routerTypeIdentifier":"JuniperNetworksInc-MMXSeriesRouters-JunOS95","software":"JunOS 9.5+","vendor":"Juniper Networks, Inc.","xsltTemplateName":"customer-router-juniper-generic.xslt","xsltTemplateNameForMacSec":"customer-router-juniper-generic-macsec.xslt"},
        {"platform":"SRX Series Routers","routerTypeIdentifier":"JuniperNetworksInc-SRXSeriesRouters-JunOS95","software":"JunOS 9.5+","vendor":"Juniper Networks, Inc.","xsltTemplateName":"customer-router-juniper-generic.xslt","xsltTemplateNameForMacSec":""},
        {"platform":"T Series Routers","routerTypeIdentifier":"JuniperNetworksInc-TSeriesRouters-JunOS95","software":"JunOS 9.5+","vendor":"Juniper Networks, Inc.","xsltTemplateName":"customer-router-juniper-generic.xslt","xsltTemplateNameForMacSec":""},
        {"platform":"PA-3000+ and 5000+ series","routerTypeIdentifier":"PaloAltoNetworks-PA3000and5000series-PANOS803","software":"PAN-OS 8.0.3+","vendor":"Palo Alto Networks","xsltTemplateName":"customer-router-palo-alto-generic.xslt","xsltTemplateNameForMacSec":""}]
        }
        ```
        """
        return pulumi.get(self, "router_type_identifier")

    @property
    @pulumi.getter
    def software(self) -> str:
        """
        Router operating system
        """
        return pulumi.get(self, "software")

    @property
    @pulumi.getter
    def vendor(self) -> str:
        """
        Router vendor
        """
        return pulumi.get(self, "vendor")

    @property
    @pulumi.getter(name="xsltTemplateName")
    def xslt_template_name(self) -> str:
        """
        Router XSLT Template Name
        """
        return pulumi.get(self, "xslt_template_name")

    @property
    @pulumi.getter(name="xsltTemplateNameForMacSec")
    def xslt_template_name_for_mac_sec(self) -> str:
        return pulumi.get(self, "xslt_template_name_for_mac_sec")


