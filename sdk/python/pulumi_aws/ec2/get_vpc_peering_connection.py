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
    'GetVpcPeeringConnectionResult',
    'AwaitableGetVpcPeeringConnectionResult',
    'get_vpc_peering_connection',
    'get_vpc_peering_connection_output',
]

@pulumi.output_type
class GetVpcPeeringConnectionResult:
    """
    A collection of values returned by getVpcPeeringConnection.
    """
    def __init__(__self__, accepter=None, cidr_block=None, cidr_block_sets=None, filters=None, id=None, ipv6_cidr_block_sets=None, owner_id=None, peer_cidr_block=None, peer_cidr_block_sets=None, peer_ipv6_cidr_block_sets=None, peer_owner_id=None, peer_region=None, peer_vpc_id=None, region=None, requester=None, status=None, tags=None, vpc_id=None):
        if accepter and not isinstance(accepter, dict):
            raise TypeError("Expected argument 'accepter' to be a dict")
        pulumi.set(__self__, "accepter", accepter)
        if cidr_block and not isinstance(cidr_block, str):
            raise TypeError("Expected argument 'cidr_block' to be a str")
        pulumi.set(__self__, "cidr_block", cidr_block)
        if cidr_block_sets and not isinstance(cidr_block_sets, list):
            raise TypeError("Expected argument 'cidr_block_sets' to be a list")
        pulumi.set(__self__, "cidr_block_sets", cidr_block_sets)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipv6_cidr_block_sets and not isinstance(ipv6_cidr_block_sets, list):
            raise TypeError("Expected argument 'ipv6_cidr_block_sets' to be a list")
        pulumi.set(__self__, "ipv6_cidr_block_sets", ipv6_cidr_block_sets)
        if owner_id and not isinstance(owner_id, str):
            raise TypeError("Expected argument 'owner_id' to be a str")
        pulumi.set(__self__, "owner_id", owner_id)
        if peer_cidr_block and not isinstance(peer_cidr_block, str):
            raise TypeError("Expected argument 'peer_cidr_block' to be a str")
        pulumi.set(__self__, "peer_cidr_block", peer_cidr_block)
        if peer_cidr_block_sets and not isinstance(peer_cidr_block_sets, list):
            raise TypeError("Expected argument 'peer_cidr_block_sets' to be a list")
        pulumi.set(__self__, "peer_cidr_block_sets", peer_cidr_block_sets)
        if peer_ipv6_cidr_block_sets and not isinstance(peer_ipv6_cidr_block_sets, list):
            raise TypeError("Expected argument 'peer_ipv6_cidr_block_sets' to be a list")
        pulumi.set(__self__, "peer_ipv6_cidr_block_sets", peer_ipv6_cidr_block_sets)
        if peer_owner_id and not isinstance(peer_owner_id, str):
            raise TypeError("Expected argument 'peer_owner_id' to be a str")
        pulumi.set(__self__, "peer_owner_id", peer_owner_id)
        if peer_region and not isinstance(peer_region, str):
            raise TypeError("Expected argument 'peer_region' to be a str")
        pulumi.set(__self__, "peer_region", peer_region)
        if peer_vpc_id and not isinstance(peer_vpc_id, str):
            raise TypeError("Expected argument 'peer_vpc_id' to be a str")
        pulumi.set(__self__, "peer_vpc_id", peer_vpc_id)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if requester and not isinstance(requester, dict):
            raise TypeError("Expected argument 'requester' to be a dict")
        pulumi.set(__self__, "requester", requester)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if vpc_id and not isinstance(vpc_id, str):
            raise TypeError("Expected argument 'vpc_id' to be a str")
        pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def accepter(self) -> Mapping[str, bool]:
        """
        Configuration block that describes [VPC Peering Connection]
        (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
        """
        return pulumi.get(self, "accepter")

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> str:
        """
        CIDR block associated to the VPC of the specific VPC Peering Connection.
        """
        return pulumi.get(self, "cidr_block")

    @property
    @pulumi.getter(name="cidrBlockSets")
    def cidr_block_sets(self) -> Sequence['outputs.GetVpcPeeringConnectionCidrBlockSetResult']:
        """
        List of objects with IPv4 CIDR blocks of the requester VPC.
        """
        return pulumi.get(self, "cidr_block_sets")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetVpcPeeringConnectionFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipv6CidrBlockSets")
    def ipv6_cidr_block_sets(self) -> Sequence['outputs.GetVpcPeeringConnectionIpv6CidrBlockSetResult']:
        """
        List of objects with IPv6 CIDR blocks of the requester VPC.
        """
        return pulumi.get(self, "ipv6_cidr_block_sets")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> str:
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter(name="peerCidrBlock")
    def peer_cidr_block(self) -> str:
        return pulumi.get(self, "peer_cidr_block")

    @property
    @pulumi.getter(name="peerCidrBlockSets")
    def peer_cidr_block_sets(self) -> Sequence['outputs.GetVpcPeeringConnectionPeerCidrBlockSetResult']:
        """
        List of objects with IPv4 CIDR blocks of the accepter VPC.
        """
        return pulumi.get(self, "peer_cidr_block_sets")

    @property
    @pulumi.getter(name="peerIpv6CidrBlockSets")
    def peer_ipv6_cidr_block_sets(self) -> Sequence['outputs.GetVpcPeeringConnectionPeerIpv6CidrBlockSetResult']:
        """
        List of objects with IPv6 CIDR blocks of the accepter VPC.
        """
        return pulumi.get(self, "peer_ipv6_cidr_block_sets")

    @property
    @pulumi.getter(name="peerOwnerId")
    def peer_owner_id(self) -> str:
        return pulumi.get(self, "peer_owner_id")

    @property
    @pulumi.getter(name="peerRegion")
    def peer_region(self) -> str:
        return pulumi.get(self, "peer_region")

    @property
    @pulumi.getter(name="peerVpcId")
    def peer_vpc_id(self) -> str:
        return pulumi.get(self, "peer_vpc_id")

    @property
    @pulumi.getter
    def region(self) -> str:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def requester(self) -> Mapping[str, bool]:
        """
        Configuration block that describes [VPC Peering Connection]
        (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
        """
        return pulumi.get(self, "requester")

    @property
    @pulumi.getter
    def status(self) -> str:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        return pulumi.get(self, "vpc_id")


class AwaitableGetVpcPeeringConnectionResult(GetVpcPeeringConnectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVpcPeeringConnectionResult(
            accepter=self.accepter,
            cidr_block=self.cidr_block,
            cidr_block_sets=self.cidr_block_sets,
            filters=self.filters,
            id=self.id,
            ipv6_cidr_block_sets=self.ipv6_cidr_block_sets,
            owner_id=self.owner_id,
            peer_cidr_block=self.peer_cidr_block,
            peer_cidr_block_sets=self.peer_cidr_block_sets,
            peer_ipv6_cidr_block_sets=self.peer_ipv6_cidr_block_sets,
            peer_owner_id=self.peer_owner_id,
            peer_region=self.peer_region,
            peer_vpc_id=self.peer_vpc_id,
            region=self.region,
            requester=self.requester,
            status=self.status,
            tags=self.tags,
            vpc_id=self.vpc_id)


def get_vpc_peering_connection(cidr_block: Optional[str] = None,
                               filters: Optional[Sequence[Union['GetVpcPeeringConnectionFilterArgs', 'GetVpcPeeringConnectionFilterArgsDict']]] = None,
                               id: Optional[str] = None,
                               owner_id: Optional[str] = None,
                               peer_cidr_block: Optional[str] = None,
                               peer_owner_id: Optional[str] = None,
                               peer_region: Optional[str] = None,
                               peer_vpc_id: Optional[str] = None,
                               region: Optional[str] = None,
                               status: Optional[str] = None,
                               tags: Optional[Mapping[str, str]] = None,
                               vpc_id: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVpcPeeringConnectionResult:
    """
    The VPC Peering Connection data source provides details about
    a specific VPC peering connection.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    # Declare the data source
    pc = aws.ec2.get_vpc_peering_connection(vpc_id=foo["id"],
        peer_cidr_block="10.0.1.0/22")
    # Create a route table
    rt = aws.ec2.RouteTable("rt", vpc_id=foo["id"])
    # Create a route
    r = aws.ec2.Route("r",
        route_table_id=rt.id,
        destination_cidr_block=pc.peer_cidr_block,
        vpc_peering_connection_id=pc.id)
    ```


    :param str cidr_block: Primary CIDR block of the requester VPC of the specific VPC Peering Connection to retrieve.
    :param Sequence[Union['GetVpcPeeringConnectionFilterArgs', 'GetVpcPeeringConnectionFilterArgsDict']] filters: Custom filter block as described below.
    :param str id: ID of the specific VPC Peering Connection to retrieve.
    :param str owner_id: AWS account ID of the owner of the requester VPC of the specific VPC Peering Connection to retrieve.
    :param str peer_cidr_block: Primary CIDR block of the accepter VPC of the specific VPC Peering Connection to retrieve.
    :param str peer_owner_id: AWS account ID of the owner of the accepter VPC of the specific VPC Peering Connection to retrieve.
    :param str peer_region: Region of the accepter VPC of the specific VPC Peering Connection to retrieve.
    :param str peer_vpc_id: ID of the accepter VPC of the specific VPC Peering Connection to retrieve.
    :param str region: Region of the requester VPC of the specific VPC Peering Connection to retrieve.
    :param str status: Status of the specific VPC Peering Connection to retrieve.
    :param Mapping[str, str] tags: Map of tags, each pair of which must exactly match
           a pair on the desired VPC Peering Connection.
           
           More complex filters can be expressed using one or more `filter` sub-blocks,
           which take the following arguments:
    :param str vpc_id: ID of the requester VPC of the specific VPC Peering Connection to retrieve.
    """
    __args__ = dict()
    __args__['cidrBlock'] = cidr_block
    __args__['filters'] = filters
    __args__['id'] = id
    __args__['ownerId'] = owner_id
    __args__['peerCidrBlock'] = peer_cidr_block
    __args__['peerOwnerId'] = peer_owner_id
    __args__['peerRegion'] = peer_region
    __args__['peerVpcId'] = peer_vpc_id
    __args__['region'] = region
    __args__['status'] = status
    __args__['tags'] = tags
    __args__['vpcId'] = vpc_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ec2/getVpcPeeringConnection:getVpcPeeringConnection', __args__, opts=opts, typ=GetVpcPeeringConnectionResult).value

    return AwaitableGetVpcPeeringConnectionResult(
        accepter=pulumi.get(__ret__, 'accepter'),
        cidr_block=pulumi.get(__ret__, 'cidr_block'),
        cidr_block_sets=pulumi.get(__ret__, 'cidr_block_sets'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        ipv6_cidr_block_sets=pulumi.get(__ret__, 'ipv6_cidr_block_sets'),
        owner_id=pulumi.get(__ret__, 'owner_id'),
        peer_cidr_block=pulumi.get(__ret__, 'peer_cidr_block'),
        peer_cidr_block_sets=pulumi.get(__ret__, 'peer_cidr_block_sets'),
        peer_ipv6_cidr_block_sets=pulumi.get(__ret__, 'peer_ipv6_cidr_block_sets'),
        peer_owner_id=pulumi.get(__ret__, 'peer_owner_id'),
        peer_region=pulumi.get(__ret__, 'peer_region'),
        peer_vpc_id=pulumi.get(__ret__, 'peer_vpc_id'),
        region=pulumi.get(__ret__, 'region'),
        requester=pulumi.get(__ret__, 'requester'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        vpc_id=pulumi.get(__ret__, 'vpc_id'))


@_utilities.lift_output_func(get_vpc_peering_connection)
def get_vpc_peering_connection_output(cidr_block: Optional[pulumi.Input[Optional[str]]] = None,
                                      filters: Optional[pulumi.Input[Optional[Sequence[Union['GetVpcPeeringConnectionFilterArgs', 'GetVpcPeeringConnectionFilterArgsDict']]]]] = None,
                                      id: Optional[pulumi.Input[Optional[str]]] = None,
                                      owner_id: Optional[pulumi.Input[Optional[str]]] = None,
                                      peer_cidr_block: Optional[pulumi.Input[Optional[str]]] = None,
                                      peer_owner_id: Optional[pulumi.Input[Optional[str]]] = None,
                                      peer_region: Optional[pulumi.Input[Optional[str]]] = None,
                                      peer_vpc_id: Optional[pulumi.Input[Optional[str]]] = None,
                                      region: Optional[pulumi.Input[Optional[str]]] = None,
                                      status: Optional[pulumi.Input[Optional[str]]] = None,
                                      tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                                      vpc_id: Optional[pulumi.Input[Optional[str]]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVpcPeeringConnectionResult]:
    """
    The VPC Peering Connection data source provides details about
    a specific VPC peering connection.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    # Declare the data source
    pc = aws.ec2.get_vpc_peering_connection(vpc_id=foo["id"],
        peer_cidr_block="10.0.1.0/22")
    # Create a route table
    rt = aws.ec2.RouteTable("rt", vpc_id=foo["id"])
    # Create a route
    r = aws.ec2.Route("r",
        route_table_id=rt.id,
        destination_cidr_block=pc.peer_cidr_block,
        vpc_peering_connection_id=pc.id)
    ```


    :param str cidr_block: Primary CIDR block of the requester VPC of the specific VPC Peering Connection to retrieve.
    :param Sequence[Union['GetVpcPeeringConnectionFilterArgs', 'GetVpcPeeringConnectionFilterArgsDict']] filters: Custom filter block as described below.
    :param str id: ID of the specific VPC Peering Connection to retrieve.
    :param str owner_id: AWS account ID of the owner of the requester VPC of the specific VPC Peering Connection to retrieve.
    :param str peer_cidr_block: Primary CIDR block of the accepter VPC of the specific VPC Peering Connection to retrieve.
    :param str peer_owner_id: AWS account ID of the owner of the accepter VPC of the specific VPC Peering Connection to retrieve.
    :param str peer_region: Region of the accepter VPC of the specific VPC Peering Connection to retrieve.
    :param str peer_vpc_id: ID of the accepter VPC of the specific VPC Peering Connection to retrieve.
    :param str region: Region of the requester VPC of the specific VPC Peering Connection to retrieve.
    :param str status: Status of the specific VPC Peering Connection to retrieve.
    :param Mapping[str, str] tags: Map of tags, each pair of which must exactly match
           a pair on the desired VPC Peering Connection.
           
           More complex filters can be expressed using one or more `filter` sub-blocks,
           which take the following arguments:
    :param str vpc_id: ID of the requester VPC of the specific VPC Peering Connection to retrieve.
    """
    ...
