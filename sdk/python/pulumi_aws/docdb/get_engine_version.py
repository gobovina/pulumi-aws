# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetEngineVersionResult',
    'AwaitableGetEngineVersionResult',
    'get_engine_version',
    'get_engine_version_output',
]

@pulumi.output_type
class GetEngineVersionResult:
    """
    A collection of values returned by getEngineVersion.
    """
    def __init__(__self__, engine=None, engine_description=None, exportable_log_types=None, id=None, parameter_group_family=None, preferred_versions=None, supports_log_exports_to_cloudwatch=None, valid_upgrade_targets=None, version=None, version_description=None):
        if engine and not isinstance(engine, str):
            raise TypeError("Expected argument 'engine' to be a str")
        pulumi.set(__self__, "engine", engine)
        if engine_description and not isinstance(engine_description, str):
            raise TypeError("Expected argument 'engine_description' to be a str")
        pulumi.set(__self__, "engine_description", engine_description)
        if exportable_log_types and not isinstance(exportable_log_types, list):
            raise TypeError("Expected argument 'exportable_log_types' to be a list")
        pulumi.set(__self__, "exportable_log_types", exportable_log_types)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if parameter_group_family and not isinstance(parameter_group_family, str):
            raise TypeError("Expected argument 'parameter_group_family' to be a str")
        pulumi.set(__self__, "parameter_group_family", parameter_group_family)
        if preferred_versions and not isinstance(preferred_versions, list):
            raise TypeError("Expected argument 'preferred_versions' to be a list")
        pulumi.set(__self__, "preferred_versions", preferred_versions)
        if supports_log_exports_to_cloudwatch and not isinstance(supports_log_exports_to_cloudwatch, bool):
            raise TypeError("Expected argument 'supports_log_exports_to_cloudwatch' to be a bool")
        pulumi.set(__self__, "supports_log_exports_to_cloudwatch", supports_log_exports_to_cloudwatch)
        if valid_upgrade_targets and not isinstance(valid_upgrade_targets, list):
            raise TypeError("Expected argument 'valid_upgrade_targets' to be a list")
        pulumi.set(__self__, "valid_upgrade_targets", valid_upgrade_targets)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)
        if version_description and not isinstance(version_description, str):
            raise TypeError("Expected argument 'version_description' to be a str")
        pulumi.set(__self__, "version_description", version_description)

    @property
    @pulumi.getter
    def engine(self) -> Optional[str]:
        return pulumi.get(self, "engine")

    @property
    @pulumi.getter(name="engineDescription")
    def engine_description(self) -> str:
        """
        The description of the database engine.
        """
        return pulumi.get(self, "engine_description")

    @property
    @pulumi.getter(name="exportableLogTypes")
    def exportable_log_types(self) -> Sequence[str]:
        """
        Set of log types that the database engine has available for export to CloudWatch Logs.
        """
        return pulumi.get(self, "exportable_log_types")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="parameterGroupFamily")
    def parameter_group_family(self) -> str:
        return pulumi.get(self, "parameter_group_family")

    @property
    @pulumi.getter(name="preferredVersions")
    def preferred_versions(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "preferred_versions")

    @property
    @pulumi.getter(name="supportsLogExportsToCloudwatch")
    def supports_log_exports_to_cloudwatch(self) -> bool:
        """
        Indicates whether the engine version supports exporting the log types specified by `exportable_log_types` to CloudWatch Logs.
        """
        return pulumi.get(self, "supports_log_exports_to_cloudwatch")

    @property
    @pulumi.getter(name="validUpgradeTargets")
    def valid_upgrade_targets(self) -> Sequence[str]:
        """
        A set of engine versions that this database engine version can be upgraded to.
        """
        return pulumi.get(self, "valid_upgrade_targets")

    @property
    @pulumi.getter
    def version(self) -> str:
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="versionDescription")
    def version_description(self) -> str:
        """
        The description of the database engine version.
        """
        return pulumi.get(self, "version_description")


class AwaitableGetEngineVersionResult(GetEngineVersionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEngineVersionResult(
            engine=self.engine,
            engine_description=self.engine_description,
            exportable_log_types=self.exportable_log_types,
            id=self.id,
            parameter_group_family=self.parameter_group_family,
            preferred_versions=self.preferred_versions,
            supports_log_exports_to_cloudwatch=self.supports_log_exports_to_cloudwatch,
            valid_upgrade_targets=self.valid_upgrade_targets,
            version=self.version,
            version_description=self.version_description)


def get_engine_version(engine: Optional[str] = None,
                       parameter_group_family: Optional[str] = None,
                       preferred_versions: Optional[Sequence[str]] = None,
                       version: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEngineVersionResult:
    """
    Information about a DocumentDB engine version.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.docdb.get_engine_version(version="3.6.0")
    ```


    :param str engine: DB engine. (Default: `docdb`)
    :param str parameter_group_family: The name of a specific DB parameter group family. An example parameter group family is `docdb3.6`.
    :param Sequence[str] preferred_versions: Ordered list of preferred engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. If both the `version` and `preferred_versions` arguments are not configured, the data source will return the default version for the engine.
    :param str version: Version of the DB engine. For example, `3.6.0`. If `version` and `preferred_versions` are not set, the data source will provide information for the AWS-defined default version. If both the `version` and `preferred_versions` arguments are not configured, the data source will return the default version for the engine.
    """
    __args__ = dict()
    __args__['engine'] = engine
    __args__['parameterGroupFamily'] = parameter_group_family
    __args__['preferredVersions'] = preferred_versions
    __args__['version'] = version
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:docdb/getEngineVersion:getEngineVersion', __args__, opts=opts, typ=GetEngineVersionResult).value

    return AwaitableGetEngineVersionResult(
        engine=__ret__.engine,
        engine_description=__ret__.engine_description,
        exportable_log_types=__ret__.exportable_log_types,
        id=__ret__.id,
        parameter_group_family=__ret__.parameter_group_family,
        preferred_versions=__ret__.preferred_versions,
        supports_log_exports_to_cloudwatch=__ret__.supports_log_exports_to_cloudwatch,
        valid_upgrade_targets=__ret__.valid_upgrade_targets,
        version=__ret__.version,
        version_description=__ret__.version_description)


@_utilities.lift_output_func(get_engine_version)
def get_engine_version_output(engine: Optional[pulumi.Input[Optional[str]]] = None,
                              parameter_group_family: Optional[pulumi.Input[Optional[str]]] = None,
                              preferred_versions: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                              version: Optional[pulumi.Input[Optional[str]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEngineVersionResult]:
    """
    Information about a DocumentDB engine version.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.docdb.get_engine_version(version="3.6.0")
    ```


    :param str engine: DB engine. (Default: `docdb`)
    :param str parameter_group_family: The name of a specific DB parameter group family. An example parameter group family is `docdb3.6`.
    :param Sequence[str] preferred_versions: Ordered list of preferred engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. If both the `version` and `preferred_versions` arguments are not configured, the data source will return the default version for the engine.
    :param str version: Version of the DB engine. For example, `3.6.0`. If `version` and `preferred_versions` are not set, the data source will provide information for the AWS-defined default version. If both the `version` and `preferred_versions` arguments are not configured, the data source will return the default version for the engine.
    """
    ...
