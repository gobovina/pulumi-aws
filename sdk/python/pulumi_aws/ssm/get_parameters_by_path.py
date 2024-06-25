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
    'GetParametersByPathResult',
    'AwaitableGetParametersByPathResult',
    'get_parameters_by_path',
    'get_parameters_by_path_output',
]

@pulumi.output_type
class GetParametersByPathResult:
    """
    A collection of values returned by getParametersByPath.
    """
    def __init__(__self__, arns=None, id=None, names=None, path=None, recursive=None, types=None, values=None, with_decryption=None):
        if arns and not isinstance(arns, list):
            raise TypeError("Expected argument 'arns' to be a list")
        pulumi.set(__self__, "arns", arns)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)
        if recursive and not isinstance(recursive, bool):
            raise TypeError("Expected argument 'recursive' to be a bool")
        pulumi.set(__self__, "recursive", recursive)
        if types and not isinstance(types, list):
            raise TypeError("Expected argument 'types' to be a list")
        pulumi.set(__self__, "types", types)
        if values and not isinstance(values, list):
            raise TypeError("Expected argument 'values' to be a list")
        pulumi.set(__self__, "values", values)
        if with_decryption and not isinstance(with_decryption, bool):
            raise TypeError("Expected argument 'with_decryption' to be a bool")
        pulumi.set(__self__, "with_decryption", with_decryption)

    @property
    @pulumi.getter
    def arns(self) -> Sequence[str]:
        """
        A list that contains the Amazon Resource Names (ARNs) of the retrieved parameters.
        """
        return pulumi.get(self, "arns")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list that contains the names of the retrieved parameters.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter
    def path(self) -> str:
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def recursive(self) -> Optional[bool]:
        return pulumi.get(self, "recursive")

    @property
    @pulumi.getter
    def types(self) -> Sequence[str]:
        """
        A list that contains the types (`String`, `StringList`, or `SecureString`) of retrieved parameters.
        """
        return pulumi.get(self, "types")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        A list that contains the retrieved parameter values. **Note:** This value is always marked as sensitive in the pulumi preview output, regardless of whether any retrieved parameters are of `SecureString` type. Use the `nonsensitive` function to override the behavior at your own risk and discretion, if you are certain that there are no sensitive values being retrieved.
        """
        return pulumi.get(self, "values")

    @property
    @pulumi.getter(name="withDecryption")
    def with_decryption(self) -> Optional[bool]:
        return pulumi.get(self, "with_decryption")


class AwaitableGetParametersByPathResult(GetParametersByPathResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetParametersByPathResult(
            arns=self.arns,
            id=self.id,
            names=self.names,
            path=self.path,
            recursive=self.recursive,
            types=self.types,
            values=self.values,
            with_decryption=self.with_decryption)


def get_parameters_by_path(path: Optional[str] = None,
                           recursive: Optional[bool] = None,
                           with_decryption: Optional[bool] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetParametersByPathResult:
    """
    Use this data source to access information about an existing resource.

    :param str path: The hierarchy for the parameter. Hierarchies start with a forward slash (/). The hierarchy is the parameter name except the last part of the parameter. The last part of the parameter name can't be in the path. A parameter name hierarchy can have a maximum of 15 levels. **Note:** If the parameter name (e.g., `/my-app/my-param`) is specified, the data source will not retrieve any value as designed, unless there are other parameters that happen to use the former path in their hierarchy (e.g., `/my-app/my-param/my-actual-param`).
    :param bool recursive: Whether to retrieve all parameters within the hirerachy. Defaults to `false`.
    :param bool with_decryption: Whether to retrieve all parameters in the hierarchy, particularly those of `SecureString` type, with their value decrypted. Defaults to `true`.
    """
    __args__ = dict()
    __args__['path'] = path
    __args__['recursive'] = recursive
    __args__['withDecryption'] = with_decryption
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ssm/getParametersByPath:getParametersByPath', __args__, opts=opts, typ=GetParametersByPathResult).value

    return AwaitableGetParametersByPathResult(
        arns=pulumi.get(__ret__, 'arns'),
        id=pulumi.get(__ret__, 'id'),
        names=pulumi.get(__ret__, 'names'),
        path=pulumi.get(__ret__, 'path'),
        recursive=pulumi.get(__ret__, 'recursive'),
        types=pulumi.get(__ret__, 'types'),
        values=pulumi.get(__ret__, 'values'),
        with_decryption=pulumi.get(__ret__, 'with_decryption'))


@_utilities.lift_output_func(get_parameters_by_path)
def get_parameters_by_path_output(path: Optional[pulumi.Input[str]] = None,
                                  recursive: Optional[pulumi.Input[Optional[bool]]] = None,
                                  with_decryption: Optional[pulumi.Input[Optional[bool]]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetParametersByPathResult]:
    """
    Use this data source to access information about an existing resource.

    :param str path: The hierarchy for the parameter. Hierarchies start with a forward slash (/). The hierarchy is the parameter name except the last part of the parameter. The last part of the parameter name can't be in the path. A parameter name hierarchy can have a maximum of 15 levels. **Note:** If the parameter name (e.g., `/my-app/my-param`) is specified, the data source will not retrieve any value as designed, unless there are other parameters that happen to use the former path in their hierarchy (e.g., `/my-app/my-param/my-actual-param`).
    :param bool recursive: Whether to retrieve all parameters within the hirerachy. Defaults to `false`.
    :param bool with_decryption: Whether to retrieve all parameters in the hierarchy, particularly those of `SecureString` type, with their value decrypted. Defaults to `true`.
    """
    ...
