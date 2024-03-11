# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetVpcDhcpOptionsResult',
    'AwaitableGetVpcDhcpOptionsResult',
    'get_vpc_dhcp_options',
    'get_vpc_dhcp_options_output',
]

@pulumi.output_type
class GetVpcDhcpOptionsResult:
    """
    A collection of values returned by getVpcDhcpOptions.
    """
    def __init__(__self__, arn=None, dhcp_options_id=None, domain_name=None, domain_name_servers=None, filters=None, id=None, netbios_name_servers=None, netbios_node_type=None, ntp_servers=None, owner_id=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if dhcp_options_id and not isinstance(dhcp_options_id, str):
            raise TypeError("Expected argument 'dhcp_options_id' to be a str")
        pulumi.set(__self__, "dhcp_options_id", dhcp_options_id)
        if domain_name and not isinstance(domain_name, str):
            raise TypeError("Expected argument 'domain_name' to be a str")
        pulumi.set(__self__, "domain_name", domain_name)
        if domain_name_servers and not isinstance(domain_name_servers, list):
            raise TypeError("Expected argument 'domain_name_servers' to be a list")
        pulumi.set(__self__, "domain_name_servers", domain_name_servers)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if netbios_name_servers and not isinstance(netbios_name_servers, list):
            raise TypeError("Expected argument 'netbios_name_servers' to be a list")
        pulumi.set(__self__, "netbios_name_servers", netbios_name_servers)
        if netbios_node_type and not isinstance(netbios_node_type, str):
            raise TypeError("Expected argument 'netbios_node_type' to be a str")
        pulumi.set(__self__, "netbios_node_type", netbios_node_type)
        if ntp_servers and not isinstance(ntp_servers, list):
            raise TypeError("Expected argument 'ntp_servers' to be a list")
        pulumi.set(__self__, "ntp_servers", ntp_servers)
        if owner_id and not isinstance(owner_id, str):
            raise TypeError("Expected argument 'owner_id' to be a str")
        pulumi.set(__self__, "owner_id", owner_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the DHCP Options Set.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="dhcpOptionsId")
    def dhcp_options_id(self) -> str:
        """
        EC2 DHCP Options ID
        """
        return pulumi.get(self, "dhcp_options_id")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        """
        Suffix domain name to used when resolving non Fully Qualified Domain NamesE.g., the `search` value in the `/etc/resolv.conf` file.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="domainNameServers")
    def domain_name_servers(self) -> Sequence[str]:
        """
        List of name servers.
        """
        return pulumi.get(self, "domain_name_servers")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetVpcDhcpOptionsFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="netbiosNameServers")
    def netbios_name_servers(self) -> Sequence[str]:
        """
        List of NETBIOS name servers.
        """
        return pulumi.get(self, "netbios_name_servers")

    @property
    @pulumi.getter(name="netbiosNodeType")
    def netbios_node_type(self) -> str:
        """
        NetBIOS node type (1, 2, 4, or 8). For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
        """
        return pulumi.get(self, "netbios_node_type")

    @property
    @pulumi.getter(name="ntpServers")
    def ntp_servers(self) -> Sequence[str]:
        """
        List of NTP servers.
        """
        return pulumi.get(self, "ntp_servers")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> str:
        """
        ID of the AWS account that owns the DHCP options set.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Map of tags assigned to the resource.
        """
        return pulumi.get(self, "tags")


class AwaitableGetVpcDhcpOptionsResult(GetVpcDhcpOptionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVpcDhcpOptionsResult(
            arn=self.arn,
            dhcp_options_id=self.dhcp_options_id,
            domain_name=self.domain_name,
            domain_name_servers=self.domain_name_servers,
            filters=self.filters,
            id=self.id,
            netbios_name_servers=self.netbios_name_servers,
            netbios_node_type=self.netbios_node_type,
            ntp_servers=self.ntp_servers,
            owner_id=self.owner_id,
            tags=self.tags)


def get_vpc_dhcp_options(dhcp_options_id: Optional[str] = None,
                         filters: Optional[Sequence[pulumi.InputType['GetVpcDhcpOptionsFilterArgs']]] = None,
                         tags: Optional[Mapping[str, str]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVpcDhcpOptionsResult:
    """
    Retrieve information about an EC2 DHCP Options configuration.

    ## Example Usage

    ### Lookup by DHCP Options ID

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ec2.get_vpc_dhcp_options(dhcp_options_id="dopts-12345678")
    ```
    <!--End PulumiCodeChooser -->

    ### Lookup by Filter

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ec2.get_vpc_dhcp_options(filters=[
        aws.ec2.GetVpcDhcpOptionsFilterArgs(
            name="key",
            values=["domain-name"],
        ),
        aws.ec2.GetVpcDhcpOptionsFilterArgs(
            name="value",
            values=["example.com"],
        ),
    ])
    ```
    <!--End PulumiCodeChooser -->


    :param str dhcp_options_id: EC2 DHCP Options ID.
    :param Sequence[pulumi.InputType['GetVpcDhcpOptionsFilterArgs']] filters: List of custom filters as described below.
    :param Mapping[str, str] tags: Map of tags assigned to the resource.
    """
    __args__ = dict()
    __args__['dhcpOptionsId'] = dhcp_options_id
    __args__['filters'] = filters
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ec2/getVpcDhcpOptions:getVpcDhcpOptions', __args__, opts=opts, typ=GetVpcDhcpOptionsResult).value

    return AwaitableGetVpcDhcpOptionsResult(
        arn=pulumi.get(__ret__, 'arn'),
        dhcp_options_id=pulumi.get(__ret__, 'dhcp_options_id'),
        domain_name=pulumi.get(__ret__, 'domain_name'),
        domain_name_servers=pulumi.get(__ret__, 'domain_name_servers'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        netbios_name_servers=pulumi.get(__ret__, 'netbios_name_servers'),
        netbios_node_type=pulumi.get(__ret__, 'netbios_node_type'),
        ntp_servers=pulumi.get(__ret__, 'ntp_servers'),
        owner_id=pulumi.get(__ret__, 'owner_id'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_vpc_dhcp_options)
def get_vpc_dhcp_options_output(dhcp_options_id: Optional[pulumi.Input[Optional[str]]] = None,
                                filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetVpcDhcpOptionsFilterArgs']]]]] = None,
                                tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVpcDhcpOptionsResult]:
    """
    Retrieve information about an EC2 DHCP Options configuration.

    ## Example Usage

    ### Lookup by DHCP Options ID

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ec2.get_vpc_dhcp_options(dhcp_options_id="dopts-12345678")
    ```
    <!--End PulumiCodeChooser -->

    ### Lookup by Filter

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ec2.get_vpc_dhcp_options(filters=[
        aws.ec2.GetVpcDhcpOptionsFilterArgs(
            name="key",
            values=["domain-name"],
        ),
        aws.ec2.GetVpcDhcpOptionsFilterArgs(
            name="value",
            values=["example.com"],
        ),
    ])
    ```
    <!--End PulumiCodeChooser -->


    :param str dhcp_options_id: EC2 DHCP Options ID.
    :param Sequence[pulumi.InputType['GetVpcDhcpOptionsFilterArgs']] filters: List of custom filters as described below.
    :param Mapping[str, str] tags: Map of tags assigned to the resource.
    """
    ...
