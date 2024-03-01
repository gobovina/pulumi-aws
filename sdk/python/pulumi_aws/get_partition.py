# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetPartitionResult',
    'AwaitableGetPartitionResult',
    'get_partition',
    'get_partition_output',
]

@pulumi.output_type
class GetPartitionResult:
    """
    A collection of values returned by getPartition.
    """
    def __init__(__self__, dns_suffix=None, id=None, partition=None, reverse_dns_prefix=None):
        if dns_suffix and not isinstance(dns_suffix, str):
            raise TypeError("Expected argument 'dns_suffix' to be a str")
        pulumi.set(__self__, "dns_suffix", dns_suffix)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if partition and not isinstance(partition, str):
            raise TypeError("Expected argument 'partition' to be a str")
        pulumi.set(__self__, "partition", partition)
        if reverse_dns_prefix and not isinstance(reverse_dns_prefix, str):
            raise TypeError("Expected argument 'reverse_dns_prefix' to be a str")
        pulumi.set(__self__, "reverse_dns_prefix", reverse_dns_prefix)

    @property
    @pulumi.getter(name="dnsSuffix")
    def dns_suffix(self) -> str:
        """
        Base DNS domain name for the current partition (e.g., `amazonaws.com` in AWS Commercial, `amazonaws.com.cn` in AWS China).
        """
        return pulumi.get(self, "dns_suffix")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Identifier of the current partition (e.g., `aws` in AWS Commercial, `aws-cn` in AWS China).
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def partition(self) -> str:
        """
        Identifier of the current partition (e.g., `aws` in AWS Commercial, `aws-cn` in AWS China).
        """
        return pulumi.get(self, "partition")

    @property
    @pulumi.getter(name="reverseDnsPrefix")
    def reverse_dns_prefix(self) -> str:
        """
        Prefix of service names (e.g., `com.amazonaws` in AWS Commercial, `cn.com.amazonaws` in AWS China).
        """
        return pulumi.get(self, "reverse_dns_prefix")


class AwaitableGetPartitionResult(GetPartitionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPartitionResult(
            dns_suffix=self.dns_suffix,
            id=self.id,
            partition=self.partition,
            reverse_dns_prefix=self.reverse_dns_prefix)


def get_partition(id: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPartitionResult:
    """
    Use this data source to lookup information about the current AWS partition in
    which the provider is working.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    current = aws.get_partition()
    s3_policy = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        sid="1",
        actions=["s3:ListBucket"],
        resources=[f"arn:{current.partition}:s3:::my-bucket"],
    )])
    ```


    :param str id: Identifier of the current partition (e.g., `aws` in AWS Commercial, `aws-cn` in AWS China).
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:index/getPartition:getPartition', __args__, opts=opts, typ=GetPartitionResult).value

    return AwaitableGetPartitionResult(
        dns_suffix=pulumi.get(__ret__, 'dns_suffix'),
        id=pulumi.get(__ret__, 'id'),
        partition=pulumi.get(__ret__, 'partition'),
        reverse_dns_prefix=pulumi.get(__ret__, 'reverse_dns_prefix'))


@_utilities.lift_output_func(get_partition)
def get_partition_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPartitionResult]:
    """
    Use this data source to lookup information about the current AWS partition in
    which the provider is working.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    current = aws.get_partition()
    s3_policy = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
        sid="1",
        actions=["s3:ListBucket"],
        resources=[f"arn:{current.partition}:s3:::my-bucket"],
    )])
    ```


    :param str id: Identifier of the current partition (e.g., `aws` in AWS Commercial, `aws-cn` in AWS China).
    """
    ...
