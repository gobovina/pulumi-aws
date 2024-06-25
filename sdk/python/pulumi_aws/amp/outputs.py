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

__all__ = [
    'ScraperDestination',
    'ScraperDestinationAmp',
    'ScraperSource',
    'ScraperSourceEks',
    'ScraperTimeouts',
    'WorkspaceLoggingConfiguration',
]

@pulumi.output_type
class ScraperDestination(dict):
    def __init__(__self__, *,
                 amp: Optional['outputs.ScraperDestinationAmp'] = None):
        """
        :param 'ScraperDestinationAmpArgs' amp: Configuration block for an Amazon Managed Prometheus workspace destination. See `amp`.
        """
        if amp is not None:
            pulumi.set(__self__, "amp", amp)

    @property
    @pulumi.getter
    def amp(self) -> Optional['outputs.ScraperDestinationAmp']:
        """
        Configuration block for an Amazon Managed Prometheus workspace destination. See `amp`.
        """
        return pulumi.get(self, "amp")


@pulumi.output_type
class ScraperDestinationAmp(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "workspaceArn":
            suggest = "workspace_arn"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ScraperDestinationAmp. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ScraperDestinationAmp.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ScraperDestinationAmp.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 workspace_arn: str):
        """
        :param str workspace_arn: The Amazon Resource Name (ARN) of the prometheus workspace.
        """
        pulumi.set(__self__, "workspace_arn", workspace_arn)

    @property
    @pulumi.getter(name="workspaceArn")
    def workspace_arn(self) -> str:
        """
        The Amazon Resource Name (ARN) of the prometheus workspace.
        """
        return pulumi.get(self, "workspace_arn")


@pulumi.output_type
class ScraperSource(dict):
    def __init__(__self__, *,
                 eks: Optional['outputs.ScraperSourceEks'] = None):
        """
        :param 'ScraperSourceEksArgs' eks: Configuration block for an EKS cluster source. See `eks`.
        """
        if eks is not None:
            pulumi.set(__self__, "eks", eks)

    @property
    @pulumi.getter
    def eks(self) -> Optional['outputs.ScraperSourceEks']:
        """
        Configuration block for an EKS cluster source. See `eks`.
        """
        return pulumi.get(self, "eks")


@pulumi.output_type
class ScraperSourceEks(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "clusterArn":
            suggest = "cluster_arn"
        elif key == "subnetIds":
            suggest = "subnet_ids"
        elif key == "securityGroupIds":
            suggest = "security_group_ids"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ScraperSourceEks. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ScraperSourceEks.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ScraperSourceEks.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 cluster_arn: str,
                 subnet_ids: Sequence[str],
                 security_group_ids: Optional[Sequence[str]] = None):
        """
        :param Sequence[str] subnet_ids: List of subnet IDs. Must be in at least two different availability zones.
        :param Sequence[str] security_group_ids: List of the security group IDs for the Amazon EKS cluster VPC configuration.
        """
        pulumi.set(__self__, "cluster_arn", cluster_arn)
        pulumi.set(__self__, "subnet_ids", subnet_ids)
        if security_group_ids is not None:
            pulumi.set(__self__, "security_group_ids", security_group_ids)

    @property
    @pulumi.getter(name="clusterArn")
    def cluster_arn(self) -> str:
        return pulumi.get(self, "cluster_arn")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Sequence[str]:
        """
        List of subnet IDs. Must be in at least two different availability zones.
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[Sequence[str]]:
        """
        List of the security group IDs for the Amazon EKS cluster VPC configuration.
        """
        return pulumi.get(self, "security_group_ids")


@pulumi.output_type
class ScraperTimeouts(dict):
    def __init__(__self__, *,
                 create: Optional[str] = None,
                 delete: Optional[str] = None):
        """
        :param str create: A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
        :param str delete: A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
        """
        if create is not None:
            pulumi.set(__self__, "create", create)
        if delete is not None:
            pulumi.set(__self__, "delete", delete)

    @property
    @pulumi.getter
    def create(self) -> Optional[str]:
        """
        A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
        """
        return pulumi.get(self, "create")

    @property
    @pulumi.getter
    def delete(self) -> Optional[str]:
        """
        A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
        """
        return pulumi.get(self, "delete")


@pulumi.output_type
class WorkspaceLoggingConfiguration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "logGroupArn":
            suggest = "log_group_arn"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in WorkspaceLoggingConfiguration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        WorkspaceLoggingConfiguration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        WorkspaceLoggingConfiguration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 log_group_arn: str):
        """
        :param str log_group_arn: The ARN of the CloudWatch log group to which the vended log data will be published. This log group must exist.
        """
        pulumi.set(__self__, "log_group_arn", log_group_arn)

    @property
    @pulumi.getter(name="logGroupArn")
    def log_group_arn(self) -> str:
        """
        The ARN of the CloudWatch log group to which the vended log data will be published. This log group must exist.
        """
        return pulumi.get(self, "log_group_arn")


