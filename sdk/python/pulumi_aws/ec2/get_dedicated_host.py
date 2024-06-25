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
    'GetDedicatedHostResult',
    'AwaitableGetDedicatedHostResult',
    'get_dedicated_host',
    'get_dedicated_host_output',
]

@pulumi.output_type
class GetDedicatedHostResult:
    """
    A collection of values returned by getDedicatedHost.
    """
    def __init__(__self__, arn=None, asset_id=None, auto_placement=None, availability_zone=None, cores=None, filters=None, host_id=None, host_recovery=None, id=None, instance_family=None, instance_type=None, outpost_arn=None, owner_id=None, sockets=None, tags=None, total_vcpus=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if asset_id and not isinstance(asset_id, str):
            raise TypeError("Expected argument 'asset_id' to be a str")
        pulumi.set(__self__, "asset_id", asset_id)
        if auto_placement and not isinstance(auto_placement, str):
            raise TypeError("Expected argument 'auto_placement' to be a str")
        pulumi.set(__self__, "auto_placement", auto_placement)
        if availability_zone and not isinstance(availability_zone, str):
            raise TypeError("Expected argument 'availability_zone' to be a str")
        pulumi.set(__self__, "availability_zone", availability_zone)
        if cores and not isinstance(cores, int):
            raise TypeError("Expected argument 'cores' to be a int")
        pulumi.set(__self__, "cores", cores)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if host_id and not isinstance(host_id, str):
            raise TypeError("Expected argument 'host_id' to be a str")
        pulumi.set(__self__, "host_id", host_id)
        if host_recovery and not isinstance(host_recovery, str):
            raise TypeError("Expected argument 'host_recovery' to be a str")
        pulumi.set(__self__, "host_recovery", host_recovery)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_family and not isinstance(instance_family, str):
            raise TypeError("Expected argument 'instance_family' to be a str")
        pulumi.set(__self__, "instance_family", instance_family)
        if instance_type and not isinstance(instance_type, str):
            raise TypeError("Expected argument 'instance_type' to be a str")
        pulumi.set(__self__, "instance_type", instance_type)
        if outpost_arn and not isinstance(outpost_arn, str):
            raise TypeError("Expected argument 'outpost_arn' to be a str")
        pulumi.set(__self__, "outpost_arn", outpost_arn)
        if owner_id and not isinstance(owner_id, str):
            raise TypeError("Expected argument 'owner_id' to be a str")
        pulumi.set(__self__, "owner_id", owner_id)
        if sockets and not isinstance(sockets, int):
            raise TypeError("Expected argument 'sockets' to be a int")
        pulumi.set(__self__, "sockets", sockets)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if total_vcpus and not isinstance(total_vcpus, int):
            raise TypeError("Expected argument 'total_vcpus' to be a int")
        pulumi.set(__self__, "total_vcpus", total_vcpus)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        ARN of the Dedicated Host.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="assetId")
    def asset_id(self) -> str:
        """
        The ID of the Outpost hardware asset on which the Dedicated Host is allocated.
        """
        return pulumi.get(self, "asset_id")

    @property
    @pulumi.getter(name="autoPlacement")
    def auto_placement(self) -> str:
        """
        Whether auto-placement is on or off.
        """
        return pulumi.get(self, "auto_placement")

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> str:
        """
        Availability Zone of the Dedicated Host.
        """
        return pulumi.get(self, "availability_zone")

    @property
    @pulumi.getter
    def cores(self) -> int:
        """
        Number of cores on the Dedicated Host.
        """
        return pulumi.get(self, "cores")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetDedicatedHostFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter(name="hostId")
    def host_id(self) -> str:
        return pulumi.get(self, "host_id")

    @property
    @pulumi.getter(name="hostRecovery")
    def host_recovery(self) -> str:
        """
        Whether host recovery is enabled or disabled for the Dedicated Host.
        """
        return pulumi.get(self, "host_recovery")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceFamily")
    def instance_family(self) -> str:
        """
        Instance family supported by the Dedicated Host. For example, "m5".
        """
        return pulumi.get(self, "instance_family")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> str:
        """
        Instance type supported by the Dedicated Host. For example, "m5.large". If the host supports multiple instance types, no instanceType is returned.
        """
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="outpostArn")
    def outpost_arn(self) -> str:
        """
        ARN of the AWS Outpost on which the Dedicated Host is allocated.
        """
        return pulumi.get(self, "outpost_arn")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> str:
        """
        ID of the AWS account that owns the Dedicated Host.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter
    def sockets(self) -> int:
        """
        Number of sockets on the Dedicated Host.
        """
        return pulumi.get(self, "sockets")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="totalVcpus")
    def total_vcpus(self) -> int:
        """
        Total number of vCPUs on the Dedicated Host.
        """
        return pulumi.get(self, "total_vcpus")


class AwaitableGetDedicatedHostResult(GetDedicatedHostResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDedicatedHostResult(
            arn=self.arn,
            asset_id=self.asset_id,
            auto_placement=self.auto_placement,
            availability_zone=self.availability_zone,
            cores=self.cores,
            filters=self.filters,
            host_id=self.host_id,
            host_recovery=self.host_recovery,
            id=self.id,
            instance_family=self.instance_family,
            instance_type=self.instance_type,
            outpost_arn=self.outpost_arn,
            owner_id=self.owner_id,
            sockets=self.sockets,
            tags=self.tags,
            total_vcpus=self.total_vcpus)


def get_dedicated_host(filters: Optional[Sequence[Union['GetDedicatedHostFilterArgs', 'GetDedicatedHostFilterArgsDict']]] = None,
                       host_id: Optional[str] = None,
                       tags: Optional[Mapping[str, str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDedicatedHostResult:
    """
    Use this data source to get information about an EC2 Dedicated Host.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test_dedicated_host = aws.ec2.DedicatedHost("test",
        instance_type="c5.18xlarge",
        availability_zone="us-west-2a")
    test = aws.ec2.get_dedicated_host_output(host_id=test_dedicated_host.id)
    ```

    ### Filter Example

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.ec2.get_dedicated_host(filters=[{
        "name": "instance-type",
        "values": ["c5.18xlarge"],
    }])
    ```


    :param Sequence[Union['GetDedicatedHostFilterArgs', 'GetDedicatedHostFilterArgsDict']] filters: Configuration block. Detailed below.
    :param str host_id: ID of the Dedicated Host.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['hostId'] = host_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ec2/getDedicatedHost:getDedicatedHost', __args__, opts=opts, typ=GetDedicatedHostResult).value

    return AwaitableGetDedicatedHostResult(
        arn=pulumi.get(__ret__, 'arn'),
        asset_id=pulumi.get(__ret__, 'asset_id'),
        auto_placement=pulumi.get(__ret__, 'auto_placement'),
        availability_zone=pulumi.get(__ret__, 'availability_zone'),
        cores=pulumi.get(__ret__, 'cores'),
        filters=pulumi.get(__ret__, 'filters'),
        host_id=pulumi.get(__ret__, 'host_id'),
        host_recovery=pulumi.get(__ret__, 'host_recovery'),
        id=pulumi.get(__ret__, 'id'),
        instance_family=pulumi.get(__ret__, 'instance_family'),
        instance_type=pulumi.get(__ret__, 'instance_type'),
        outpost_arn=pulumi.get(__ret__, 'outpost_arn'),
        owner_id=pulumi.get(__ret__, 'owner_id'),
        sockets=pulumi.get(__ret__, 'sockets'),
        tags=pulumi.get(__ret__, 'tags'),
        total_vcpus=pulumi.get(__ret__, 'total_vcpus'))


@_utilities.lift_output_func(get_dedicated_host)
def get_dedicated_host_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetDedicatedHostFilterArgs', 'GetDedicatedHostFilterArgsDict']]]]] = None,
                              host_id: Optional[pulumi.Input[Optional[str]]] = None,
                              tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDedicatedHostResult]:
    """
    Use this data source to get information about an EC2 Dedicated Host.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test_dedicated_host = aws.ec2.DedicatedHost("test",
        instance_type="c5.18xlarge",
        availability_zone="us-west-2a")
    test = aws.ec2.get_dedicated_host_output(host_id=test_dedicated_host.id)
    ```

    ### Filter Example

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.ec2.get_dedicated_host(filters=[{
        "name": "instance-type",
        "values": ["c5.18xlarge"],
    }])
    ```


    :param Sequence[Union['GetDedicatedHostFilterArgs', 'GetDedicatedHostFilterArgsDict']] filters: Configuration block. Detailed below.
    :param str host_id: ID of the Dedicated Host.
    """
    ...
