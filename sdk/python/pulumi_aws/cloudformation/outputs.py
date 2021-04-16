# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'StackSetAutoDeployment',
]

@pulumi.output_type
class StackSetAutoDeployment(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "retainStacksOnAccountRemoval":
            suggest = "retain_stacks_on_account_removal"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in StackSetAutoDeployment. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        StackSetAutoDeployment.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        StackSetAutoDeployment.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 enabled: Optional[bool] = None,
                 retain_stacks_on_account_removal: Optional[bool] = None):
        """
        :param bool enabled: Whether or not auto-deployment is enabled.
        :param bool retain_stacks_on_account_removal: Whether or not to retain stacks when the account is removed.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if retain_stacks_on_account_removal is not None:
            pulumi.set(__self__, "retain_stacks_on_account_removal", retain_stacks_on_account_removal)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[bool]:
        """
        Whether or not auto-deployment is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="retainStacksOnAccountRemoval")
    def retain_stacks_on_account_removal(self) -> Optional[bool]:
        """
        Whether or not to retain stacks when the account is removed.
        """
        return pulumi.get(self, "retain_stacks_on_account_removal")


