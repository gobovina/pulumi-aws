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
    'GetParameterResult',
    'AwaitableGetParameterResult',
    'get_parameter',
    'get_parameter_output',
]

@pulumi.output_type
class GetParameterResult:
    """
    A collection of values returned by getParameter.
    """
    def __init__(__self__, arn=None, id=None, insecure_value=None, name=None, type=None, value=None, version=None, with_decryption=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if insecure_value and not isinstance(insecure_value, str):
            raise TypeError("Expected argument 'insecure_value' to be a str")
        pulumi.set(__self__, "insecure_value", insecure_value)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if value and not isinstance(value, str):
            raise TypeError("Expected argument 'value' to be a str")
        pulumi.set(__self__, "value", value)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)
        if with_decryption and not isinstance(with_decryption, bool):
            raise TypeError("Expected argument 'with_decryption' to be a bool")
        pulumi.set(__self__, "with_decryption", with_decryption)

    @property
    @pulumi.getter
    def arn(self) -> str:
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="insecureValue")
    def insecure_value(self) -> str:
        return pulumi.get(self, "insecure_value")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")

    @property
    @pulumi.getter
    def version(self) -> int:
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="withDecryption")
    def with_decryption(self) -> Optional[bool]:
        return pulumi.get(self, "with_decryption")


class AwaitableGetParameterResult(GetParameterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetParameterResult(
            arn=self.arn,
            id=self.id,
            insecure_value=self.insecure_value,
            name=self.name,
            type=self.type,
            value=self.value,
            version=self.version,
            with_decryption=self.with_decryption)


def get_parameter(name: Optional[str] = None,
                  with_decryption: Optional[bool] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetParameterResult:
    """
    Provides an SSM Parameter data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    foo = aws.ssm.get_parameter(name="foo")
    ```

    > **Note:** The unencrypted value of a SecureString will be stored in the raw state as plain-text.


    :param str name: Name of the parameter.
    :param bool with_decryption: Whether to return decrypted `SecureString` value. Defaults to `true`.
           
           In addition to all arguments above, the following attributes are exported:
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['withDecryption'] = with_decryption
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ssm/getParameter:getParameter', __args__, opts=opts, typ=GetParameterResult).value

    return AwaitableGetParameterResult(
        arn=pulumi.get(__ret__, 'arn'),
        id=pulumi.get(__ret__, 'id'),
        insecure_value=pulumi.get(__ret__, 'insecure_value'),
        name=pulumi.get(__ret__, 'name'),
        type=pulumi.get(__ret__, 'type'),
        value=pulumi.get(__ret__, 'value'),
        version=pulumi.get(__ret__, 'version'),
        with_decryption=pulumi.get(__ret__, 'with_decryption'))


@_utilities.lift_output_func(get_parameter)
def get_parameter_output(name: Optional[pulumi.Input[str]] = None,
                         with_decryption: Optional[pulumi.Input[Optional[bool]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetParameterResult]:
    """
    Provides an SSM Parameter data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    foo = aws.ssm.get_parameter(name="foo")
    ```

    > **Note:** The unencrypted value of a SecureString will be stored in the raw state as plain-text.


    :param str name: Name of the parameter.
    :param bool with_decryption: Whether to return decrypted `SecureString` value. Defaults to `true`.
           
           In addition to all arguments above, the following attributes are exported:
    """
    ...
