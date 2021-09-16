# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

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
    def __init__(__self__, auto_placement=None, availability_zone=None, cores=None, host_id=None, host_recovery=None, id=None, instance_family=None, instance_state=None, instance_type=None, sockets=None, tags=None, total_vcpus=None):
        if auto_placement and not isinstance(auto_placement, str):
            raise TypeError("Expected argument 'auto_placement' to be a str")
        pulumi.set(__self__, "auto_placement", auto_placement)
        if availability_zone and not isinstance(availability_zone, str):
            raise TypeError("Expected argument 'availability_zone' to be a str")
        pulumi.set(__self__, "availability_zone", availability_zone)
        if cores and not isinstance(cores, int):
            raise TypeError("Expected argument 'cores' to be a int")
        pulumi.set(__self__, "cores", cores)
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
        if instance_state and not isinstance(instance_state, str):
            raise TypeError("Expected argument 'instance_state' to be a str")
        pulumi.set(__self__, "instance_state", instance_state)
        if instance_type and not isinstance(instance_type, str):
            raise TypeError("Expected argument 'instance_type' to be a str")
        pulumi.set(__self__, "instance_type", instance_type)
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
    @pulumi.getter(name="autoPlacement")
    def auto_placement(self) -> str:
        return pulumi.get(self, "auto_placement")

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> str:
        return pulumi.get(self, "availability_zone")

    @property
    @pulumi.getter
    def cores(self) -> int:
        """
        The number of cores on the Dedicated Host.
        """
        return pulumi.get(self, "cores")

    @property
    @pulumi.getter(name="hostId")
    def host_id(self) -> str:
        """
        The host ID.
        """
        return pulumi.get(self, "host_id")

    @property
    @pulumi.getter(name="hostRecovery")
    def host_recovery(self) -> str:
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
        The instance family supported by the Dedicated Host. For example, m5.
        * `instance_type` -The instance type supported by the Dedicated Host. For example, m5.large. If the host supports multiple instance types, no instanceType is returned.
        """
        return pulumi.get(self, "instance_family")

    @property
    @pulumi.getter(name="instanceState")
    def instance_state(self) -> str:
        return pulumi.get(self, "instance_state")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> str:
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter
    def sockets(self) -> int:
        """
        The instance family supported by the Dedicated Host. For example, m5.
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
        The total number of vCPUs on the Dedicated Host.
        """
        return pulumi.get(self, "total_vcpus")


class AwaitableGetDedicatedHostResult(GetDedicatedHostResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDedicatedHostResult(
            auto_placement=self.auto_placement,
            availability_zone=self.availability_zone,
            cores=self.cores,
            host_id=self.host_id,
            host_recovery=self.host_recovery,
            id=self.id,
            instance_family=self.instance_family,
            instance_state=self.instance_state,
            instance_type=self.instance_type,
            sockets=self.sockets,
            tags=self.tags,
            total_vcpus=self.total_vcpus)


def get_dedicated_host(host_id: Optional[str] = None,
                       tags: Optional[Mapping[str, str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDedicatedHostResult:
    """
    Use this data source to get information about the host when allocating an EC2 Dedicated Host.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.ec2.DedicatedHost("test",
        auto_placement="on",
        availability_zone="us-west-1a",
        host_recovery="on",
        instance_type="c5.18xlarge")
    test_data = test.id.apply(lambda id: aws.ec2.get_dedicated_host(host_id=id))
    ```


    :param str host_id: The host ID.
    """
    __args__ = dict()
    __args__['hostId'] = host_id
    __args__['tags'] = tags
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:ec2/getDedicatedHost:getDedicatedHost', __args__, opts=opts, typ=GetDedicatedHostResult).value

    return AwaitableGetDedicatedHostResult(
        auto_placement=__ret__.auto_placement,
        availability_zone=__ret__.availability_zone,
        cores=__ret__.cores,
        host_id=__ret__.host_id,
        host_recovery=__ret__.host_recovery,
        id=__ret__.id,
        instance_family=__ret__.instance_family,
        instance_state=__ret__.instance_state,
        instance_type=__ret__.instance_type,
        sockets=__ret__.sockets,
        tags=__ret__.tags,
        total_vcpus=__ret__.total_vcpus)


@_utilities.lift_output_func(get_dedicated_host)
def get_dedicated_host_output(host_id: Optional[pulumi.Input[str]] = None,
                              tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDedicatedHostResult]:
    """
    Use this data source to get information about the host when allocating an EC2 Dedicated Host.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.ec2.DedicatedHost("test",
        auto_placement="on",
        availability_zone="us-west-1a",
        host_recovery="on",
        instance_type="c5.18xlarge")
    test_data = test.id.apply(lambda id: aws.ec2.get_dedicated_host(host_id=id))
    ```


    :param str host_id: The host ID.
    """
    ...
