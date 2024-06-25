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
from . import outputs
from ._inputs import *

__all__ = [
    'GetVpcEndpointResult',
    'AwaitableGetVpcEndpointResult',
    'get_vpc_endpoint',
    'get_vpc_endpoint_output',
]

@pulumi.output_type
class GetVpcEndpointResult:
    """
    A collection of values returned by getVpcEndpoint.
    """
    def __init__(__self__, arn=None, cidr_blocks=None, dns_entries=None, dns_options=None, filters=None, id=None, ip_address_type=None, network_interface_ids=None, owner_id=None, policy=None, prefix_list_id=None, private_dns_enabled=None, requester_managed=None, route_table_ids=None, security_group_ids=None, service_name=None, state=None, subnet_ids=None, tags=None, vpc_endpoint_type=None, vpc_id=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if cidr_blocks and not isinstance(cidr_blocks, list):
            raise TypeError("Expected argument 'cidr_blocks' to be a list")
        pulumi.set(__self__, "cidr_blocks", cidr_blocks)
        if dns_entries and not isinstance(dns_entries, list):
            raise TypeError("Expected argument 'dns_entries' to be a list")
        pulumi.set(__self__, "dns_entries", dns_entries)
        if dns_options and not isinstance(dns_options, list):
            raise TypeError("Expected argument 'dns_options' to be a list")
        pulumi.set(__self__, "dns_options", dns_options)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_address_type and not isinstance(ip_address_type, str):
            raise TypeError("Expected argument 'ip_address_type' to be a str")
        pulumi.set(__self__, "ip_address_type", ip_address_type)
        if network_interface_ids and not isinstance(network_interface_ids, list):
            raise TypeError("Expected argument 'network_interface_ids' to be a list")
        pulumi.set(__self__, "network_interface_ids", network_interface_ids)
        if owner_id and not isinstance(owner_id, str):
            raise TypeError("Expected argument 'owner_id' to be a str")
        pulumi.set(__self__, "owner_id", owner_id)
        if policy and not isinstance(policy, str):
            raise TypeError("Expected argument 'policy' to be a str")
        pulumi.set(__self__, "policy", policy)
        if prefix_list_id and not isinstance(prefix_list_id, str):
            raise TypeError("Expected argument 'prefix_list_id' to be a str")
        pulumi.set(__self__, "prefix_list_id", prefix_list_id)
        if private_dns_enabled and not isinstance(private_dns_enabled, bool):
            raise TypeError("Expected argument 'private_dns_enabled' to be a bool")
        pulumi.set(__self__, "private_dns_enabled", private_dns_enabled)
        if requester_managed and not isinstance(requester_managed, bool):
            raise TypeError("Expected argument 'requester_managed' to be a bool")
        pulumi.set(__self__, "requester_managed", requester_managed)
        if route_table_ids and not isinstance(route_table_ids, list):
            raise TypeError("Expected argument 'route_table_ids' to be a list")
        pulumi.set(__self__, "route_table_ids", route_table_ids)
        if security_group_ids and not isinstance(security_group_ids, list):
            raise TypeError("Expected argument 'security_group_ids' to be a list")
        pulumi.set(__self__, "security_group_ids", security_group_ids)
        if service_name and not isinstance(service_name, str):
            raise TypeError("Expected argument 'service_name' to be a str")
        pulumi.set(__self__, "service_name", service_name)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if subnet_ids and not isinstance(subnet_ids, list):
            raise TypeError("Expected argument 'subnet_ids' to be a list")
        pulumi.set(__self__, "subnet_ids", subnet_ids)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if vpc_endpoint_type and not isinstance(vpc_endpoint_type, str):
            raise TypeError("Expected argument 'vpc_endpoint_type' to be a str")
        pulumi.set(__self__, "vpc_endpoint_type", vpc_endpoint_type)
        if vpc_id and not isinstance(vpc_id, str):
            raise TypeError("Expected argument 'vpc_id' to be a str")
        pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the VPC endpoint.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="cidrBlocks")
    def cidr_blocks(self) -> Sequence[str]:
        """
        List of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
        """
        return pulumi.get(self, "cidr_blocks")

    @property
    @pulumi.getter(name="dnsEntries")
    def dns_entries(self) -> Sequence['outputs.GetVpcEndpointDnsEntryResult']:
        """
        DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS entry blocks are documented below.
        """
        return pulumi.get(self, "dns_entries")

    @property
    @pulumi.getter(name="dnsOptions")
    def dns_options(self) -> Sequence['outputs.GetVpcEndpointDnsOptionResult']:
        """
        DNS options for the VPC Endpoint. DNS options blocks are documented below.
        """
        return pulumi.get(self, "dns_options")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetVpcEndpointFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipAddressType")
    def ip_address_type(self) -> str:
        return pulumi.get(self, "ip_address_type")

    @property
    @pulumi.getter(name="networkInterfaceIds")
    def network_interface_ids(self) -> Sequence[str]:
        """
        One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
        """
        return pulumi.get(self, "network_interface_ids")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> str:
        """
        ID of the AWS account that owns the VPC endpoint.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter
    def policy(self) -> str:
        """
        Policy document associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
        """
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter(name="prefixListId")
    def prefix_list_id(self) -> str:
        """
        Prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
        """
        return pulumi.get(self, "prefix_list_id")

    @property
    @pulumi.getter(name="privateDnsEnabled")
    def private_dns_enabled(self) -> bool:
        """
        Whether or not the VPC is associated with a private hosted zone - `true` or `false`. Applicable for endpoints of type `Interface`.
        """
        return pulumi.get(self, "private_dns_enabled")

    @property
    @pulumi.getter(name="requesterManaged")
    def requester_managed(self) -> bool:
        """
        Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
        """
        return pulumi.get(self, "requester_managed")

    @property
    @pulumi.getter(name="routeTableIds")
    def route_table_ids(self) -> Sequence[str]:
        """
        One or more route tables associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
        """
        return pulumi.get(self, "route_table_ids")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Sequence[str]:
        """
        One or more security groups associated with the network interfaces. Applicable for endpoints of type `Interface`.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> str:
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter
    def state(self) -> str:
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Sequence[str]:
        """
        One or more subnets in which the VPC Endpoint is located. Applicable for endpoints of type `Interface`.
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vpcEndpointType")
    def vpc_endpoint_type(self) -> str:
        """
        VPC Endpoint type, `Gateway` or `Interface`.
        """
        return pulumi.get(self, "vpc_endpoint_type")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        return pulumi.get(self, "vpc_id")


class AwaitableGetVpcEndpointResult(GetVpcEndpointResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVpcEndpointResult(
            arn=self.arn,
            cidr_blocks=self.cidr_blocks,
            dns_entries=self.dns_entries,
            dns_options=self.dns_options,
            filters=self.filters,
            id=self.id,
            ip_address_type=self.ip_address_type,
            network_interface_ids=self.network_interface_ids,
            owner_id=self.owner_id,
            policy=self.policy,
            prefix_list_id=self.prefix_list_id,
            private_dns_enabled=self.private_dns_enabled,
            requester_managed=self.requester_managed,
            route_table_ids=self.route_table_ids,
            security_group_ids=self.security_group_ids,
            service_name=self.service_name,
            state=self.state,
            subnet_ids=self.subnet_ids,
            tags=self.tags,
            vpc_endpoint_type=self.vpc_endpoint_type,
            vpc_id=self.vpc_id)


def get_vpc_endpoint(filters: Optional[Sequence[Union['GetVpcEndpointFilterArgs', 'GetVpcEndpointFilterArgsDict']]] = None,
                     id: Optional[str] = None,
                     service_name: Optional[str] = None,
                     state: Optional[str] = None,
                     tags: Optional[Mapping[str, str]] = None,
                     vpc_id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVpcEndpointResult:
    """
    The VPC Endpoint data source provides details about
    a specific VPC endpoint.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    # Declare the data source
    s3 = aws.ec2.get_vpc_endpoint(vpc_id=foo["id"],
        service_name="com.amazonaws.us-west-2.s3")
    private_s3 = aws.ec2.VpcEndpointRouteTableAssociation("private_s3",
        vpc_endpoint_id=s3.id,
        route_table_id=private["id"])
    ```


    :param Sequence[Union['GetVpcEndpointFilterArgs', 'GetVpcEndpointFilterArgsDict']] filters: Custom filter block as described below.
    :param str id: ID of the specific VPC Endpoint to retrieve.
    :param str service_name: Service name of the specific VPC Endpoint to retrieve. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
    :param str state: State of the specific VPC Endpoint to retrieve.
    :param Mapping[str, str] tags: Map of tags, each pair of which must exactly match
           a pair on the specific VPC Endpoint to retrieve.
    :param str vpc_id: ID of the VPC in which the specific VPC Endpoint is used.
           
           More complex filters can be expressed using one or more `filter` sub-blocks,
           which take the following arguments:
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['id'] = id
    __args__['serviceName'] = service_name
    __args__['state'] = state
    __args__['tags'] = tags
    __args__['vpcId'] = vpc_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ec2/getVpcEndpoint:getVpcEndpoint', __args__, opts=opts, typ=GetVpcEndpointResult).value

    return AwaitableGetVpcEndpointResult(
        arn=pulumi.get(__ret__, 'arn'),
        cidr_blocks=pulumi.get(__ret__, 'cidr_blocks'),
        dns_entries=pulumi.get(__ret__, 'dns_entries'),
        dns_options=pulumi.get(__ret__, 'dns_options'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        ip_address_type=pulumi.get(__ret__, 'ip_address_type'),
        network_interface_ids=pulumi.get(__ret__, 'network_interface_ids'),
        owner_id=pulumi.get(__ret__, 'owner_id'),
        policy=pulumi.get(__ret__, 'policy'),
        prefix_list_id=pulumi.get(__ret__, 'prefix_list_id'),
        private_dns_enabled=pulumi.get(__ret__, 'private_dns_enabled'),
        requester_managed=pulumi.get(__ret__, 'requester_managed'),
        route_table_ids=pulumi.get(__ret__, 'route_table_ids'),
        security_group_ids=pulumi.get(__ret__, 'security_group_ids'),
        service_name=pulumi.get(__ret__, 'service_name'),
        state=pulumi.get(__ret__, 'state'),
        subnet_ids=pulumi.get(__ret__, 'subnet_ids'),
        tags=pulumi.get(__ret__, 'tags'),
        vpc_endpoint_type=pulumi.get(__ret__, 'vpc_endpoint_type'),
        vpc_id=pulumi.get(__ret__, 'vpc_id'))


@_utilities.lift_output_func(get_vpc_endpoint)
def get_vpc_endpoint_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetVpcEndpointFilterArgs', 'GetVpcEndpointFilterArgsDict']]]]] = None,
                            id: Optional[pulumi.Input[Optional[str]]] = None,
                            service_name: Optional[pulumi.Input[Optional[str]]] = None,
                            state: Optional[pulumi.Input[Optional[str]]] = None,
                            tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                            vpc_id: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVpcEndpointResult]:
    """
    The VPC Endpoint data source provides details about
    a specific VPC endpoint.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    # Declare the data source
    s3 = aws.ec2.get_vpc_endpoint(vpc_id=foo["id"],
        service_name="com.amazonaws.us-west-2.s3")
    private_s3 = aws.ec2.VpcEndpointRouteTableAssociation("private_s3",
        vpc_endpoint_id=s3.id,
        route_table_id=private["id"])
    ```


    :param Sequence[Union['GetVpcEndpointFilterArgs', 'GetVpcEndpointFilterArgsDict']] filters: Custom filter block as described below.
    :param str id: ID of the specific VPC Endpoint to retrieve.
    :param str service_name: Service name of the specific VPC Endpoint to retrieve. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
    :param str state: State of the specific VPC Endpoint to retrieve.
    :param Mapping[str, str] tags: Map of tags, each pair of which must exactly match
           a pair on the specific VPC Endpoint to retrieve.
    :param str vpc_id: ID of the VPC in which the specific VPC Endpoint is used.
           
           More complex filters can be expressed using one or more `filter` sub-blocks,
           which take the following arguments:
    """
    ...
