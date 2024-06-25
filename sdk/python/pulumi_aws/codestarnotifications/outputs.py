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
    'NotificationRuleTarget',
]

@pulumi.output_type
class NotificationRuleTarget(dict):
    def __init__(__self__, *,
                 address: str,
                 status: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str address: The ARN of notification rule target. For example, a SNS Topic ARN.
        :param str status: The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
        :param str type: The type of the notification target. Default value is `SNS`.
        """
        pulumi.set(__self__, "address", address)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def address(self) -> str:
        """
        The ARN of notification rule target. For example, a SNS Topic ARN.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        The type of the notification target. Default value is `SNS`.
        """
        return pulumi.get(self, "type")


