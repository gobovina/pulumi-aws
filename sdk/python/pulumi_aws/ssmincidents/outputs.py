# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'ReplicationSetRegion',
    'GetReplicationSetRegionResult',
]

@pulumi.output_type
class ReplicationSetRegion(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "kmsKeyArn":
            suggest = "kms_key_arn"
        elif key == "statusMessage":
            suggest = "status_message"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ReplicationSetRegion. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ReplicationSetRegion.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ReplicationSetRegion.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: str,
                 kms_key_arn: Optional[str] = None,
                 status: Optional[str] = None,
                 status_message: Optional[str] = None):
        """
        :param str name: The name of the Region, such as `ap-southeast-2`.
        :param str kms_key_arn: The Amazon Resource name (ARN) of the customer managed key. If omitted, AWS manages the AWS KMS keys for you, using an AWS owned key, as indicated by a default value of `DefaultKey`.
        :param str status: The current status of the Region.
               * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
        :param str status_message: More information about the status of a Region.
        """
        pulumi.set(__self__, "name", name)
        if kms_key_arn is not None:
            pulumi.set(__self__, "kms_key_arn", kms_key_arn)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if status_message is not None:
            pulumi.set(__self__, "status_message", status_message)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the Region, such as `ap-southeast-2`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> Optional[str]:
        """
        The Amazon Resource name (ARN) of the customer managed key. If omitted, AWS manages the AWS KMS keys for you, using an AWS owned key, as indicated by a default value of `DefaultKey`.
        """
        return pulumi.get(self, "kms_key_arn")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The current status of the Region.
        * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusMessage")
    def status_message(self) -> Optional[str]:
        """
        More information about the status of a Region.
        """
        return pulumi.get(self, "status_message")


@pulumi.output_type
class GetReplicationSetRegionResult(dict):
    def __init__(__self__, *,
                 kms_key_arn: str,
                 name: str,
                 status: str,
                 status_message: str):
        """
        :param str kms_key_arn: The ARN of the AWS Key Management Service (AWS KMS) encryption key.
        :param str name: The name of the Region.
        :param str status: The current status of the Region.
               * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
        :param str status_message: More information about the status of a Region.
        """
        pulumi.set(__self__, "kms_key_arn", kms_key_arn)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "status_message", status_message)

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> str:
        """
        The ARN of the AWS Key Management Service (AWS KMS) encryption key.
        """
        return pulumi.get(self, "kms_key_arn")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the Region.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The current status of the Region.
        * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusMessage")
    def status_message(self) -> str:
        """
        More information about the status of a Region.
        """
        return pulumi.get(self, "status_message")


